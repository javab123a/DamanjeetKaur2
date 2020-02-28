package firstproject;

public class Charprint {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int ch=97;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
