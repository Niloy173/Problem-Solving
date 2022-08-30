import java.util.Scanner;

public class Divisors {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    long d = in.nextInt();
 
    for(int i=1;i<=d;i++)
    {
      if(d % i==0)
      {
        System.out.println(i);
      }
    }
    in.close();
  }
}
