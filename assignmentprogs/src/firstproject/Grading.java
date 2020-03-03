package firstproject;

import java.util.Scanner;

class Grading {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks=sc.nextInt();
		int m=marks/10;
		switch(m)
		{
		case 10:
		case 9:
		case 8:
				System.out.println("Excellent");
			break;
		case 7:
				System.out.println("Very Good");
			break;
		case 6:
		case 5:
				System.out.println("Good");
			break;
		case 4:
				System.out.println("Average");
			break;
		default:
			System.out.println("Fail");
		}
	}
}
