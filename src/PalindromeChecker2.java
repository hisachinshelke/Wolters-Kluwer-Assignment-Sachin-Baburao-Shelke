import java.util.Scanner;

//Using Java loop feature

public class PalindromeChecker2 {
	static Scanner scan = new Scanner(System.in);	
	
	public static void main(String args[]) {	
		System.out.println("========Welecome to Palindrome checker========");
		validatePalindrome();
	}
	
	private static void validatePalindrome() {
		System.out.println("Enter a String to check:");
		String inputStr;
		
		inputStr = scan.nextLine();
		
		if (inputStr.length() > 0)
			System.out.println("Entered text - " + (Validator.validateUsingLoop(inputStr) ? "is " : "not ") + "a Palindrome.");
		else {
			System.out.println("Please enter valid text.");
			validatePalindrome();
		}
		
		System.out.println("Do you want to continue (y/n)? : ");
			
		inputStr = scan.nextLine();
		
		if(inputStr.equalsIgnoreCase("y")) {
			validatePalindrome();
		} else {
			System.out.println("Thank you for using Palindrome Checker. Exiting the application...");
			System.exit(1);
		}
	}
}
