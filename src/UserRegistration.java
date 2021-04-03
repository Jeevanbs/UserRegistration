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

	}

}
