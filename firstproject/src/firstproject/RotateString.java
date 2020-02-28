package firstproject;

public class RotateString {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d'};
		char temp,i;
		Boolean flag=false;
		//char al=(char) a.length;
	  //  char rotate[]=new char[al];
		for(i=0;i<a.length;i++) {
			for(char j=3;j<a.length;j++) {
			        temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
			flag=true;
		}
		//for(i=0;i<a.length;i++) {
			//System.out.print(a[i]);
		//}
		if(flag==true) {
			System.out.println("String Matches");
			}
		else {
			System.out.println("String doesn't match");
		}
	}
}
