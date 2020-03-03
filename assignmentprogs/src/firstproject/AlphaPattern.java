package firstproject;

public class AlphaPattern{
	public static void main(String[] args){
		int i,j;
		for(i=5;i>=1;i--){
			if(i>=3){
				for(j=1;j<=i;j++){
					if(j==1 || j==i){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else {
				for(j=0;j<=5-i;j++){
					if(j==0||j==5-i){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}