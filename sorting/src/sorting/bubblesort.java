package sorting;
import java.util.*;
public class bubblesort {
	
	
	   public static void main(String a[])
	     {
		int arr[]=new int[10];
	        input(arr);
	        bubble(arr);
	     }

	       public static int[] input(int arr[])
	         {
	             System.out.println("enter numbers in to array");
	             Scanner s=new Scanner(System.in);
	               for(int i=0;i<arr.length;i++)
	                 arr[i]=s.nextInt();
	              
	            return arr;
	         }
	        
	         public static int[] bubble(int arr[])
	          {
	             for(int i=0;i<arr.length;i++)
	                for(int j=0;j<arr.length-1-i;j++)
	                     if(arr[j]>arr[j+1])
	                         {
	                           int temp=arr[j];
	                           arr[j]=arr[j+1];
				   arr[j+1]=temp;
				 }
			printing(arr);
			return arr;
		  }
	            
	       public static void printing(int arr[])
		{
			for(int i=0;i<arr.length;i++)
	                 System.out.println(arr[i]);
		}
	}


