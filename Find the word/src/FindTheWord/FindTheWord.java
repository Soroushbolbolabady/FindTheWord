package FindTheWord;

import java.util.Scanner;

public class FindTheWord {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence :");
		String sentence = scanner.nextLine();
		System.out.println("Enter a number :");
		int numberOfWord = scanner.nextInt();
		
		
		
		
		String[] arrOfSentence = sentence.split(" ");
		
		System.out.println(arrOfSentence[(numberOfWord-1)]);
 	}

}
