import java.util.Scanner;

public class FixedPassword {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int n;
 
    while(true)
    {
      n = in.nextInt();
 
      if(n == 1999)
      {
        System.out.println("Correct");
        break;
      }
      System.out.println("Wrong");
 
    }
    in.close();
  }
}
