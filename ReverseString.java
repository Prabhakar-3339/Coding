package sTRING;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		//String name = "Prabhakar";
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the String :");
			String name =scanner.nextLine();
			
			String revstr="";
			for(int i=0;i<name.length();i++) {
				
				revstr=name.charAt(i) + revstr;
			}
			
			System.out.println(revstr);
		}

		

	}

}
