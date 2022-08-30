import java.util.Scanner;

public class OnePrime {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    long num = in.nextLong();
    int boo = 0;
 
    for(long i=2;i<num;i++)
    {
      if(num % i == 0)
      {
        boo =1;
        break;
      }
    }
 
    if(boo ==1)
    {
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
 
    in.close();
  }
}
