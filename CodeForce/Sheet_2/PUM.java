import java.util.Scanner;

public class PUM {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int x = in.nextInt();
 
    int k=1,l=2,m=3;
 
 
    for (int i = 0; i < x; i++) {
      
      System.out.printf("%d %d %d PUM\n",k,l,m);
      k+=4;
      l+=4;
      m+=4;
 
    }
 
    in.close();
  }
}
