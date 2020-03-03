package firstproject;

public class Inumbers {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--) {
				System.out.print("   ");
			}
			for(k=1;k<=i-1;k++)
			{
				System.out.print(" "+k+" ");
			}
	for(j=i;j>=1;j--)
	{
		System.out.print(" "+j+" ");
	}
	System.out.println();
}
	}

}
