package week2.day1;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
public static void main(String[] args) {
	String text = "madam";
	String rev = "";
	for (int i = text.length() - 1; i >= 0; i--) {

		System.out.println(text.charAt(i));
		rev = rev + text.charAt(i);
	}
		System.out.println(rev);
		if (text.equalsIgnoreCase(rev)) {
			System.out.println(text + " is palindrome");
		} else
			System.out.println(text + " is not palindrome");	
}
}	



