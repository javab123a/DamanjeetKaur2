package firstproject;

import java.util.Scanner;

public class Primenum {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int n=scan.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
			if(temp>0)
			{
				System.out.println("Number is not prime");
			}
			else
			{
				System.out.println("Number is Prime");
			}
		}
	}
