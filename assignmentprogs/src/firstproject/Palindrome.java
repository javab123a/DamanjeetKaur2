package firstproject;

import java.io.*;
public class Palindrome {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int num=Integer.parseInt(buff.readLine());
		int rem=0,rev=0;
		for(;num>0;)
		{
			rem=num%10;
			System.out.print(rem);
			//rev=rev*10+rem;
			num=num/10;
		}
	}
}
