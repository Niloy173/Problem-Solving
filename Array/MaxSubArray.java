
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSubArray {

  public static void SubArray(int[] arr)
    {

     
      int start=0;
      Map<Integer,int[]> myMap = new HashMap<>();

      
      for (int i = 0; i < arr.length; i++) {
        
        for (int j = i; j < arr.length; j++) {
          
         
          int[] arr2 = Arrays.copyOfRange(arr, i, j+1);
          myMap.put(start++, arr2);
          
          

        }

      }


    


        for(Map.Entry<Integer,int[]> map: myMap.entrySet())
        {
          // int key = map.getKey();
          int[] new_arr = map.getValue().clone();
          System.out.println(Arrays.toString(new_arr));
          

          // if(new_arr.length ==1)
          // {
          //   System.out.printf("%d ",new_arr[0]);
          // }else{
            
          //   int max=0;
          //   for (int i = 0; i < new_arr.length; i++) {
              
          //     if(new_arr[i] > max)
          //     {
          //       max = new_arr[i];
          //     }
           // }
          
            //System.out.printf("%d ",max);
         // }
        }
        
      

     

      
    }
      

  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int test_case = in.nextInt();

    while(test_case!=0)
    {
      int size = in.nextInt();
      int arr[] = new int[size];

      for (int i = 0; i < size; i++) {
        
        arr[i] = in.nextInt();
      }
      SubArray(arr);
      System.out.println();
      test_case--;
    }

    in.close();
    


    
  }
}
