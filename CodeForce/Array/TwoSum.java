import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

  public static int[] result(int[] nums, int target)
  {
    int boo=0,i,j=0;
    for( i=0;i<nums.length;i++)
    {
        for( j=i+1;j<nums.length;j++)
        {
            if(nums[i] + nums[j] == target)
            {
                boo = 1;
                break;
            }
        }
       if(boo == 1)
       {
           break;
       }
    }
    return new int[]{i,j};
  }
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Size of an array");
    int size = input.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      
      arr[i] = input.nextInt();
    }

    System.out.print("Target Value : ");
    int Target = input.nextInt();

    System.out.println(Arrays.toString(result(arr,Target)));

    input.close();
  }
}
