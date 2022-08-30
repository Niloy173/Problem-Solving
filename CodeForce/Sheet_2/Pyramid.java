import java.util.Scanner;

public class Pyramid {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
 
    int x = in.nextInt();
    char c = '*';
 
    for (int i = 1; i <=x; i++) {
      
      for (int j = 1; j <=i ; j++) {
        
        System.out.printf("%c",c);
      }
      System.out.printf("\n");
    }
    in.close();
  }
}
