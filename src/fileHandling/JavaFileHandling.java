package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JavaFileHandling {

	public static void main(String[] args) throws IOException {
		final String file = "E:\\Data\\Java\\users.txt";

		//Write into File
		List<String> users = Arrays.asList("Alice", "Bob", "Charlie");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			System.out.println("Wrinting into file: "+file);
			for (String user : users) {
				writer.write(user);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}

		//Read File
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			System.out.println("Reading from file: "+file);
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
				e.printStackTrace();
		} finally {
				reader.close();
		}
		
		//Read File #2
		System.out.println("Reading from file: "+ file + "using NIO");
		List<String> lines = Files.readAllLines(Paths.get(file));
		lines.forEach(System.out::println);

	}

	

}
