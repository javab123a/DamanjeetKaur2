package firstproject;
public class SelectionArray {

	public static void main(String args[]) {
		int[] arr= {5,1,12,-5,16,2,12,14};
		Select(arr);
	}
static void Select(int a[]){

	for(int i=0;i<a.length-1;i++) {
		int min=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[min])
				i=j;
		int	temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
}
}