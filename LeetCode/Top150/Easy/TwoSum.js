/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

var twoSum = function(nums, target) {

  

  let boo=0,i,j=0;
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
        return `[${i},${j}]`;
    
};



var nums = [2, 7, 11, 15];
console.log(twoSum(nums,9))