package regex;

import java.util.regex.*;

public class JavaRegex {

	// Regex patterns
	private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
	private static final String PHONE_REGEX = "^[6-9]\\d{9}$";
	private static final String PASSWORD_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	private static final String SAMPLE_REGEX = "^[6-9]\\d{9}$";

	public static void main(String[] args) {
		String email = "sweinc.4u@gmail.com";
		String phone = "9876543210";
		String password = "java1234";
		String sample = "987654321";

		// Validate each input
		System.out.println("Email valid? " + isValid(email, EMAIL_REGEX));
		System.out.println("Phone valid? " + isValid(phone, PHONE_REGEX));
		System.out.println("Password valid? " + isValid(password, PASSWORD_REGEX));
		System.out.println("sample valid? " + isValid(sample, SAMPLE_REGEX));
	}

	// Utility method to validate using regex
	public static boolean isValid(String input, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
}

