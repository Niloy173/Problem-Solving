import java.util.Scanner;

public class Some_sum {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int N = in.nextInt();
    int A = in.nextInt();
    int B = in.nextInt();
 
    int max = Math.max(A, B);
    int min = Math.min(A,B);
 
   
 
    int result =0;
 
    for(int i=1;i<=N;i++)
    {
      
      if(i <10 && (i>=min && i<=max))
      {
        
        result +=i;
      }else{
 
        String x = String.valueOf(i);
 
        int d = GetSum(x);
      
 
        if((d >=min && d <=max) && d <=N)
        {
          result +=i;
        }
      }
 
      
    }
 
    System.out.println(result);
 
 
 
    in.close();
  }
 
  static int GetSum(String x)
  {
    int sum_ =0;
    for(int i=0;i<x.length();i++)
    {
      sum_ += Integer.parseInt(String.valueOf(x.charAt(i)));
    }
 
    return sum_;
  }
}
