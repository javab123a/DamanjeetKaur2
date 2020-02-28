package firstproject;

public class RotateResult {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d'};
		String str="abcd";
		char temp;
		//char al=(char) a.length;
		//char b[]=new char[al];
		for(char i=0;i<a.length;i++) {
			for(char j=3;j<a.length;j++) {
			        temp=a[i];//temp= str.charAt(i);
					a[i]=a[j];
					a[j]=temp;
			}
		}
		for(char i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
	}

}
