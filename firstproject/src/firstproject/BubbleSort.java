package firstproject;

public class BubbleSort {
	public static void main(String args[]){
		int[] arr={5,1,12,-5,16};
		bubbleSort(arr);
	}
	static void bubbleSort(int[] arr)
	{
		int temp,i,j;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
			for(i=0;i<arr.length-1;i++)
			{
				System.out.println(arr[i]+" ");
			}
	}
}