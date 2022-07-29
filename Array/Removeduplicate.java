import java.util.Arrays;

public class Removeduplicate {
  
  public static int removeduplicate(int[] nums)
  {
    
    if(nums.length == 0) return 0;
    int j=0;

    for (int i = 1; i < nums.length; i++) {
      
      if(nums[j] != nums[i])
      {
        j++;
        nums[j] = nums[i];
      }
    }
    return j+1;
    
  }


  public static void main(String[] args) {
    
    int nums[] = {0,0,1,1,1,2,2,3,3,4};
    int d = removeduplicate(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println(""+d);
  }
}

