package firstproject;

public class Primeprint {

	public static void main(String[] args) {
		int i,j,num=7,temp=0;
		for(i=1;i<=7;i++) {
			for(j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					temp=temp+1;//i++;
				}
				if(temp==0)
				{
					System.out.print(j+" ");
				}
				else
				{
					temp=0;
				}
			}
			System.out.println();
		}
	}
}
