import java.util.Scanner;

public class Palindrome_Checker {
	
	public static void main(String[] args) {
		
		String word, repeat="Y";
		int left_index, right_index;
		
		Scanner scan = new Scanner(System.in);
		
		while(repeat.equalsIgnoreCase("y")) {
			
			System.out.println("Enter the word:");
			word = scan.nextLine();
			
			left_index=0;
			right_index=word.length()-1;
		
			while (word.charAt(left_index)==word.charAt(right_index) && left_index<right_index) {
				left_index++;
				right_index--;
			}
			
			if (right_index>left_index)
				System.out.println("NOT PALINDROME");
			else
				System.out.println("PALIDROME");
			
			System.out.println("Check another word (y/n)?");
			repeat = scan.nextLine();
		}
	}

}
