package firstproject;

import java.io.*;

public class Fibonacci {

	public static void main(String[] args)throws IOException {
	BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number till which you want to execute Fibonacci Series: ");
	int n=Integer.parseInt(buff.readLine());
	int start=0,prev=1,next=0;
	for(int i=1;i<n;i++)
	{
		next=start+prev;
		System.out.print(" "+next);
		start=prev;
		prev=next;
	}
}
}
