import java.util.Scanner;

public class Sequence_nums_and_sums {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int x ,y;
 
    while (true) {
      x = in.nextInt();
      y= in.nextInt();
 
      if ( x<=0 || y <=0)
      {
        break;
      }
 
      int num1 = Math.max(x, y);
      int num2 = Math.min(x, y);
 
      int result =0;
 
      for(int i=num2;i<=num1;i++)
      {
        System.out.printf("%d ",i);
        result +=i;
      }
      System.out.printf("sum =%d\n",result);
     
    }
 
    in.close();
  }
}
