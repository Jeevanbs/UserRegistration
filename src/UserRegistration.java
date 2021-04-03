import java.util.function.Predicate;

public class UserRegistration {

	public static void main(String[] args) {
		
		//UC1
		String userName = "Jeevan";
		String userName1 = "Je";
		Predicate<String> userNameValidation = n -> Character.isUpperCase(n.charAt(0)) && n.length() > 3;
		System.out.println("Validation String " + userName + " --- " + userNameValidation.test(userName));
		System.out.println("Validation String " + userName1 + " --- " + userNameValidation.test(userName1));
	}

}
