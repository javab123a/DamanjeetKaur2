package firstproject;

public class Quick_sort {

		    static int partition(int arr[], int l, int h) 
		    { int temp;
		        int x = arr[h]; 
		        int i = (l - 1); 
		      
		        for (int j = l; j <= h - 1; j++) { 
		            if (arr[j] <= x) { 
		                i++; 
		                temp = arr[i]; 
		                arr[i] = arr[j]; 
		                arr[j] = temp; 
		                
		            } 
		        } 
		        temp=arr[i + 1];
		        arr[i+1]=arr[h]; 
		        arr[h]=temp;
		        return (i + 1); 
		    } 
		      
		    /* A[] --> Array to be sorted,  
		    l --> Starting index,  
		    h --> Ending index */
		    static void quickSort(int A[], int l, int h) 
		    { 
		        if (l < h) { 
		            /* Partitioning index */
		            int p = partition(A, l, h); 
		            quickSort(A, l, p - 1); 
		            quickSort(A, p + 1, h); 
		        } 
		    } 
		      
		    // Driver code 
		    public static void main(String args[]) 
		    { 
		      
		     
		        int arr[] = { 4, 2, 6, 9, 2 }; 
		        int n = 5; 
		        quickSort(arr, 0, n - 1); 
		      
		        for (int i = 0; i < n; i++) { 
		            System.out.println(arr[i]+ " "); 
		        } 
		      
		    } 
		    
}
