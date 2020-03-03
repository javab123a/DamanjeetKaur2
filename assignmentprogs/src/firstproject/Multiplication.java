package firstproject;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of table: ");
		int number=scan.nextInt();
		int result;
		for(int i=1;i<=10;i++)
		{
			result=number*i;
			System.out.println(number+" * "+i+" = "+result);
		}
	}

}
