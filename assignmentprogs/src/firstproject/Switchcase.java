package firstproject;
import java.io.*;
public class Switchcase {

	public static void main(String[] args)
	{
		int age=19,choice;
		char gender='f';
		try
		{
		InputStreamReader inn=new InputStreamReader(System.in);
		BufferedReader buf=new BufferedReader(inn);
		System.out.println("Enter your choice: 1 or 2");
		choice=Integer.parseInt(buf.readLine());
        switch(choice)
        {
        case 1:
        	if(age>=18 && gender=='f')
        	{
        		System.out.println("Eligible for marriage");
        	}
        	else
        	{
        		System.out.println("not eligible for marriage");
        	}
           	break;
         case 21:
        	 if(age>=21 && gender=='m')
         	{
         		System.out.println("Eligible for marriage");
         	}
        	 else
         	{
         		System.out.println("not eligible for marriage");
         	}
            	break;	
          default:
        	  System.out.println("Invlaid Input");
         }
		}
        catch(Exception e)
		{
			System.out.println("Error");
		}
        }
	}
