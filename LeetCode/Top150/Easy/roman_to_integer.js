/*
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/
var romanToInt = function(s) {

  const pair = {
    'I':1,
    'V':5,
    'X':10,
    'L':50,
    'C':100,
    'D':500,
    'M':1000,
    'CM':900,
    'XC':90,
    'IV':4,
    'IX':9,
    'CD':400,
    'XL':40
  }
  function check(i){

    const c1 = s[i];
    const c2 = s[++i];
    
    if(!c2){
      return false;
    }else{
      
      if(`${c1+c2}` in pair){
        
        return pair[`${c1+c2}`]
      }else{
        return false;
      }
    }
  }

  let total = 0;
  for (let index = 0; index < s.length; index++) {

    
    if(['I','X','C'].includes(s[index])){
      
      if(check(index)){
        total +=check(index);
        index+=1;
      }else{
        total+=pair[s[index]];
      }
      
    }else{
      total+=pair[s[index]]
    }
    
  }

  return total;
    
};


let s = "MMMXLV"
console.log(romanToInt(s));