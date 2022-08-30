import java.util.Scanner;

public class Max {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int n = in.nextInt();
 
    long d;
 
    long max = -1;
 
    for (int i = 1; i <= n; i++) {
      
      d = in.nextLong();
 
      if(d > max)
      {
        max = d;
      }
    }
 
    System.out.println(max);
 
    in.close();
  }
}
