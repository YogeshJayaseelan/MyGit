package swap;

import java.util.Scanner;

public class NumSwap {

	public static void main(String[] args) {
		System.out.println("Enter Number 1 & Number 2");
		Scanner Scan = new Scanner(System.in);
		int Num1 = Scan.nextInt();
		int Num2 = Scan.nextInt();
		System.out.println("The Numbers before Swap are : "+Num1+""+Num2 );
		
			Num1=Num1+Num2;
			Num2=Num1-Num2;
			Num1=Num1-Num2;
		
		System.out.println("The numbers after swap are : "+Num1+ " " +Num2);

	}

}
