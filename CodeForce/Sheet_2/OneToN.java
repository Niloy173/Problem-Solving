import java.util.Scanner;

public class OneToN {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int n = in.nextInt();
    int i=1;
 
    while (n!=0) {
 
      System.out.println(i++);
 
      n--;
      
    }
 
    in.close();
  }
}
