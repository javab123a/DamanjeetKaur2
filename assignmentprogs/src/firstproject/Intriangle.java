package firstproject;

public class Intriangle {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=8;i++)
	{
		for(j=7;j>=i;j--) {
			System.out.print("   ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print(" * ");
		}
		for(j=2;j<=i;j++) {
			System.out.print(" * ");
		}
		for(k=12;k>=j;k--)
		{
			System.out.print("   ");
		}
		System.out.println();
	}
	}

}
