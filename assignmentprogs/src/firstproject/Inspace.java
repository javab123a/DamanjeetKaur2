package firstproject;

public class Inspace {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
