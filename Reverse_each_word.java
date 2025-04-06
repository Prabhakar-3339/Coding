package sTRING;

import java.util.Scanner;

public class Reverse_each_word {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the line");
	
	String input =scanner.nextLine();
	
	String reversed =reverseString(input);
	System.out.println("Reverse line " + reversed);
	
    scanner.close();
	}
	
	public static String reverseString(String input) {
		char[] chars = input.toCharArray();
		String reversed="";
		for(int i =chars.length -1;i>=0;i--) {
			reversed+=chars[i];
		}
		return reversed;
		
	}
}
