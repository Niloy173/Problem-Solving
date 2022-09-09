import java.util.Arrays;

public class Remove_element {

  public static int removeElement(int[] nums, int val) {

 
    int target = val;
    int counter =0;

    for (int i = 0; i < nums.length; i++) {
      
      if(nums[i] == target)
      {
        nums[i] = 101;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      
      if(nums[i] != 101)
      {
        counter++;
      }
    }
        
    Arrays.sort(nums);
    return counter;
  }
  
  public static void main(String[] args) {
    
    int nums[] = {3,2,2,3};
    System.out.println(removeElement(nums, 3));
    System.out.println(Arrays.toString(nums));

  }
}
