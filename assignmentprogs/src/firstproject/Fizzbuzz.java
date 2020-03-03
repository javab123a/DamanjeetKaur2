//W.A.P. to initialize a number and check 
//if it is multiple of 3 then print 'fizz' and 
//if it is a multiple of 5 then print 'buzz' and 
//if it is multiple of both then print 'fizz-buzz'.
package firstproject;

public class Fizzbuzz {

	public static void main(String[] args) {
		int number=25;
				if(number%3==0 && number%5==0)
				{
					System.out.println("Fizz Buzz");
				}
				else if(number%5==0)
				{
					System.out.println("Buzz");
				}
				else if(number%3==0)
				{
					System.out.println("Fizz");
				}
				else
				{
					System.out.println("Number is neither multiple of 3 nor multiple of 5");
				}
	}

}
