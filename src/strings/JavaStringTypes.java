package strings;

public class JavaStringTypes {
	public static void main(String[] args) {
        // String (immutable)
        String str = "Hello";
        str.concat(" World");
        System.out.println("String: " + str);  // Hello

        // StringBuffer (mutable, thread-safe)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.reverse();
        
        System.out.println("StringBuffer: " + sb);  // Hello World

        // StringBuilder (mutable, not thread-safe)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println("StringBuilder: " + sb2);  // Hello World
    }

}
