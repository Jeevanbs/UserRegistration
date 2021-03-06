import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		//UC1
		System.out.println("Enter Firstname");
		String userName = stdin.next();
		Predicate<String> userNameValidation = n -> Character.isUpperCase(n.charAt(0)) && n.length() > 3;
		if(userNameValidation.test(userName)){
			System.out.println("Valid UserName");
		}else {
			System.out.println("InValid UserName - Firstname Has to start with Caps and length shld be greater than 3");
		}

		//UC2
		System.out.println("Enter Lastname");
		String lastName = stdin.next();
		if(userNameValidation.test(lastName)){
			System.out.println("Valid lastName");
		}else {
			System.out.println("InValid lastName - lastNames Has to start with Caps and length shld be greater than 3");
		}

		//UC3
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Predicate<String> emailValidation = Pattern.compile(regex).asPredicate();
		System.out.println("Enter Email");
		String email = stdin.next();
		if(emailValidation.test(email)) {
			System.out.println("Valid Email");
		}else {
			System.out.println("InValid Email");
		}

		//UC4
		String phoneregex = "^\\d{10}$";
		Predicate<String> phoneNoValidation = Pattern.compile(phoneregex).asPredicate();
		System.out.println("Enter Phone Number with 10 digits only");
		String phoneNo = stdin.next();
		if(phoneNoValidation.test(phoneNo)) {
			System.out.println("Valid Phone Number");
		}else {
			System.out.println("InValid Phone Number");
		}

		//UC5
		System.out.println("Enter Password -- For Length Validation");
		String pwd = stdin.next();
		Predicate<String> pwdvalidation1 = n -> n.length() >= 8;
		if(pwdvalidation1.test(pwd)) {
			System.out.println("Valid Password Length");
		}else {
			System.out.println("InValid Password length");
		}

		//UC6
		String upperCaseRegex = ".*[A-Z].*";
		Predicate<String> pwdvalidation2 =  Pattern.compile(upperCaseRegex).asPredicate();
		if(pwdvalidation2.test(pwd)) {
			System.out.println("Valid Password contains UpperCase");
		}else {
			System.out.println("InValid Password doesnt contain UpperCase");
		}

		//UC7
		String numericRegex = ".*\\d.*";
		Predicate<String> pwdvalidation3 =  Pattern.compile(numericRegex).asPredicate();
		if(pwdvalidation3.test(pwd)) {
			System.out.println("Valid Password contains Numeric");
		}else {
			System.out.println("InValid Password doesnt contain Numeric");
		}

		//UC8
		String splCharRegex = ".*[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?]{1}.*";
		Predicate<String> pwdvalidation4 =  Pattern.compile(splCharRegex).asPredicate();
		if(pwdvalidation4.test(pwd)) {
			System.out.println("Valid Password contains Special Char");
		}else {
			System.out.println("InValid Password doesnt contain Special Char");
		}

	}

}
