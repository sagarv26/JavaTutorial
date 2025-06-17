package strings;

public class JavaString {
	public static void main(String[] args) {
        String str = "  Java Programming  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 2: " + trimmed.charAt(2));

        // 5. substring()
        System.out.println("Substring (5 to 11): " + trimmed.substring(5, 11));

        // 6. contains()
        System.out.println("Contains 'gram'? " + trimmed.contains("gram"));

        // 7. equals() and equalsIgnoreCase()
        String str2 = "java programming";
        System.out.println("Equals: " + trimmed.equals(str2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2));

        // 8. startsWith() and endsWith()
        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'ing': " + trimmed.endsWith("ing"));

        // 9. indexOf()
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));

        // 10. replace()
        System.out.println("Replace 'a' with '*': " + trimmed.replace('a', '*'));

        // 11. split()
        String[] words = trimmed.split(" ");
        System.out.println("Split by space:");
        for (String word : words) {
            System.out.println("- " + word);
        }

        // 12. isEmpty() and isBlank() (Java 11+)
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());

        String blankStr = "   ";
        System.out.println("Is blank: " + blankStr.isBlank());
    }

}
