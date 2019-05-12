import java.util.Scanner;
public class Insertionsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner s = new Scanner( System.in );        
	        int n, i;
	        n = s.nextInt();
	        int arr[] = new int[ n ];
	        for (i = 0; i < n; i++)
	        {
	            arr[i] = s.nextInt();
	        }
	        insertionSort(arr);
	        for (i = 0; i < n; i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();                     
	    }    
	 public static void insertionSort( int arr[] )
	    {
	        int N = arr.length;
	        int i, j, temp;
	        for (i = 1; i< N; i++) 
	        {
	            j = i;
	            temp = arr[i];    
	            while (j > 0 && temp < arr[j-1])
	            {
	                arr[j] = arr[j-1];
	                j = j-1;
	            }
	            arr[j] = temp;            
	        }        
	    }    

}
