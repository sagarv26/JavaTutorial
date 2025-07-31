package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class JavaDeserialize {
	public static void main(String[] args) {
		UserProfile user = null;

		try (FileInputStream fileIn = new FileInputStream("E:\\Data\\user.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			user = (UserProfile) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Deserialized User: " + user);
	}
}


