package firstproject;

public class Elseif
{
	public static void main(String[] args)
	{
		int age=19;
		char gender='F';
		if(age>=18 && gender=='F')
		{
			System.out.println("Eligible for marriage");
		}
		else if(age>=21 && gender=='M')
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not eligible for marriage");
		}
	}
}
