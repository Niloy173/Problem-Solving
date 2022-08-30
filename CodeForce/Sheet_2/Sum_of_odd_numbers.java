import java.util.Scanner;

public class Sum_of_odd_numbers {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int x,j=0;
    x = in.nextInt();
 
    long[] arr = new long[x];
 
    long  num1,num2;
    while(x !=0)
    {
      num1 = in.nextLong();
      num2 = in.nextLong();
 
      long max = Math.max(num1, num2);
      long min = Math.min(num1, num2);
 
      int Koira_lo=0;
 
      if(max - min ==1)
      {
        // do nothing
      }else{
 
        for(long i=min+1;i<max;i++)
        {
          if(i % 2 ==1)
          {
            Koira_lo += i;
          }
        }
      }
      long res = Koira_lo;
      arr[j++] = res;
 
      
      x--;
 
    }
 
    for (long l : arr) {
      System.out.println(l);
    }
 
    in.close();
  }
}
