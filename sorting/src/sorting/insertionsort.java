import java.util.*;
class insertionsort
{
   public static void main(String a[])
     {
	int arr[]=new int[10];
        input(arr);
        insertion(arr);
     }

       public static int[] input(int arr[])
         {
             System.out.println("enter numbers in to array");
             Scanner s=new Scanner(System.in);
               for(int i=0;i<arr.length;i++)
                 arr[i]=s.nextInt();
              
            return arr;
         }
        
         public static int[] insertion(int arr[])
          {
             for (int i = 1; i < arr.length; i++) 
		{ 
			int valueToSort = arr[i];
			int j; 
			
			for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) 
                        {
				arr[j] = arr[j - 1];
			}
 
			
			arr[j] = valueToSort;
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