import java.util.*;
class selectionsort
{
   public static void main(String a[])
     {
	int arr[]=new int[10];
        input(arr);
        selection(arr);
     }

       public static int[] input(int arr[])
         {
             System.out.println("enter numbers in to array");
             Scanner s=new Scanner(System.in);
               for(int i=0;i<arr.length;i++)
                 arr[i]=s.nextInt();
              
            return arr;
         }
        
         public static int[] selection(int arr[])
          {
             for (int i = 0; i < arr.length - 1; i++)
		 {
 			int index = i;
			 for (int j = i + 1; j < arr.length; j++)
 				if (arr[j] < arr[index]) 
				 index = j;
 
 				        int smallerNumber = arr[index]; 
 					arr[index] = arr[i];
 					arr[i] = smallerNumber;
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