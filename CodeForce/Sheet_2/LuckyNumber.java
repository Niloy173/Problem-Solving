import java.util.Scanner;

public class LuckyNumber {
  
  static int check(long val)
  {
  
    if(String.valueOf(val).length() == 1)
    {
      if(val == 4 || val == 7)
      {
        return 1;
      }else{
        return 0;
      }
    }
   else{
 
    String val_ = String.valueOf(val);
 
    int len = val_.length();
    int count = 0;
   
    for(int i=0;i<val_.length();i++)
    {
      if(val_.charAt(i) == '4' || val_.charAt(i) =='7')
      {
        count++;
      }else{
 
        break;
      }
 
      
    }
 
    if(len == count)
    {
      return 1;
    }else{
 
      return 0;
 
    }
 
 
 
  
   }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    long num1 = in.nextLong();
    long num2 = in.nextLong();
 
    
 
    int empty =0;
    for(long i=num1;i<=num2;i++)
    {
      
      int res = check(i);
      if(res == 1)
      {
        empty =1;
        System.out.printf("%d ",i);
      }
    }
 
   
 
    if(empty ==0)
    {
      System.out.print("-1");
    }
    
 
    System.out.printf("\n");
    
 
    in.close();
  }
}
