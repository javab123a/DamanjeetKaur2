package firstproject;
import java.io.IOException;
import java.util.Scanner;
public class NewMerge {

	public static void main(String[] args)throws IOException {
		int a[]=new int[5];
		int b[]=new int[5],i,j,temp;
		int arr1_length=a.length;
		int arr2_length=b.length;
		int arr3_length=arr1_length+arr2_length;
		int c[]=new int[arr3_length];
       Scanner s=new Scanner(System.in);
        System.out.println("Enter First 5 array Elements: ");
        for(i=0;i<5;i++) {
        	a[i]=s.nextInt();
        }
        System.out.println("Enter second 5 array elements: ");
        for(i=0;i<5;i++) {
        	b[i]=s.nextInt();
        }
        for(i=0;i<a.length;i++) {
    		c[i]=a[i];
    	}
    	for(i=0;i<b.length;i++) {
    		c[a.length+i]=b[i];
    	}
    	for(i=0;i<c.length;i++){
			for(j=0;j<c.length-1;j++){
				if(c[j]>c[j+1]){
					temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
				}
			}
		}
    	for(i=0;i<c.length;i++) {
    		System.out.print(" "+c[i]+" ");
    	}
        }
	}
