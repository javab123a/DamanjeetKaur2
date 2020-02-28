package firstproject;
public class MonotoneArray {

	public static void main(String[] args) {
		int i,j;
		int[] arr={5,1,12,-5,16};
	    boolean flag=false;
	    for(i=0;i<arr.length;i++) {
	    	for(j=1;j<arr.length;j++) {
	    if(i<=j && arr[i]<=arr[j]) {
	    	flag=true;
	    	  break;
	    }
	   	}
		}
	    if(flag==true) {
    		System.out.println("Monotone");
    	}
    	else
    	{
	    		System.out.println("NOt Monotone");
    	}
	}
}
