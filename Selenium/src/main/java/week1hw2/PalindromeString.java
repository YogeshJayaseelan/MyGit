package week1hw2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		while(true)
		{
		String str;
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the word");
		str = Scan.next();
		
		int length=str.length();
		
		char[] temporary= str.toCharArray();
		char[] reverse=new char[length];
		for(int i=0;i<length;i++)
		{
			reverse[length-i-1]=temporary[i];
			
		}
		
		String reverseString=String.valueOf(reverse);
		if(reverseString.equalsIgnoreCase(str))
		{
			System.out.println("The Entered word is a Palindrome");
		}
		else
			System.out.println("The Entered word is not a Palindrome");
	}
		}

}
