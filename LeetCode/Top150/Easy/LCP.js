/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/

var longestCommonPrefix = function(strs) {
    
  const small_prefix = strs.sort((a,b) => a.length - b.length)[0];
 
  
  let count=0;
  for(let i=0;i<small_prefix.length;i++){
    if(strs.every((word) => word[i] === small_prefix[i])){
      count++;
    }else{
      break;
    }
  }
  if(count === 0){
    return "";
  }else{
    return small_prefix.substring(0,count);
  }
};


var strs = ["flower","flow","flight"];
console.log(longestCommonPrefix(strs))
