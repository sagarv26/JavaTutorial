package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class JavaSerialize {
	public static void main(String[] args) {
        UserProfile user = new UserProfile("johndoe", "john@example.com", "securePass");

        try (FileOutputStream fileOut = new FileOutputStream("E:\\Data\\user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(user);
            System.out.println("Serialized data is saved in user.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


