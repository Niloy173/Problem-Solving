import java.util.Arrays;

public class Two_sum {

  public static int[] twoSum(int[] nums, int target) {
        
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
    
    int arr[] = {2,7,11,15};
    System.out.println(Arrays.toString(twoSum(arr, 9)));
   
  }
}
