//W.A.F. called checksum() take both perameters(num1,num2)
//return String 'true' if num2>num1 else 'false'
//return "-1" if perimeter values are equal to each other.
package firstproject;

public class Numfn {
		String checksum(int num1,int num2)
		{
			if(num2>num1)
			{
				return "True";
			}
			else if(num1==num2)
			{
				return "-1";
			}
			else
			{
				return "false";
			}
		}
		public static void main(String[] args) {
			Numfn num=new Numfn();
			System.out.println(num.checksum(10,20));
		}
	}
