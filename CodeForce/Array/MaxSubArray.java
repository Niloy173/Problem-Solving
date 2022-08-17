
import java.util.Scanner;

public class MaxSubArray {

  public static void SubArray(int[] arr)
    {

  
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      int max;
      for (int i = 0; i < arr.length; i++) {
        max=arr[i];
        for (int j = i+1; j < arr.length; j++) {
          max = Math.max(max, arr[j]); 
          System.out.print(max+" ");
        }
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
