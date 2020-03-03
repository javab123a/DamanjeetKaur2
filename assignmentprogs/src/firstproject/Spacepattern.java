package firstproject;

public class Spacepattern {

	public static void main(String[] args) {
	int i,j,k;
		for(i=1;i<=5;i++)
	{
		
		for(j=4;j>=i;j--) {
			System.out.print("   ");
		}
		for(k=1;k<=i;k++)
		{
			if(k%2==0)
				System.out.print("   ");
				else
					System.out.print(" * ");
		}
		for(j=2;j<=i;j++)
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
