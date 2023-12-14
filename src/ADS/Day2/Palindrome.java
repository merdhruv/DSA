package in.cdac.blr.day2;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(new Palindrome().isPalindrome("321MADAM123"));
	}

	public static boolean isPalindrome(String s) {
		if(s.length()<=1) {  // termination
			return true;
		}
		// comparing the 1st & last characters
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			// this recursive call happens till the characters don't match, meaning its not a palindrome
			// or it is a palindrome the the string is reduced to a single character
			return isPalindrome(s.substring(1, s.length()-1));
		}
		return false;
	}
	
}
