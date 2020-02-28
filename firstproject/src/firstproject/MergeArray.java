package firstproject;

public class MergeArray {
public static void main(String[] args) {
	int arr1[]= {10,20,30};
	int arr2[]= {40,50,60}, i;
	int arr1_length=arr1.length;
	int arr2_length=arr2.length;
	int arr3_length=arr1_length+arr2_length;
	int arr3[]=new int[arr3_length];
	for(i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	}
	for(i=0;i<arr2.length;i++) {
		arr3[arr1.length+i]=arr2[i];
	}
	for(i=0;i<arr3.length;i++) {
		System.out.print(" "+arr3[i]+" ");
	}
}
}
