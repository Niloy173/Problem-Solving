public class Max_subarray {

  public static int maxSubArray(int[] nums) {
        
   

      int currentSum = 0;
      int maximumSum = nums[0];

      for (int i = 0; i < nums.length; i++) {
        
        currentSum += nums[i];

        if(currentSum > maximumSum) // initialy triggered
        {
          maximumSum = currentSum;
        }

        if(currentSum < 0)
        {
          currentSum = 0;
        }
      }

      return maximumSum;
    
}
  
  public static void main(String[] args) {
    
    int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));;
  }
}
