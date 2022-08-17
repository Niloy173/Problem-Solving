import java.util.Scanner;

public class Fibonaci {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    long x=0,y=1,z;

    if(num==1)
    {
      System.out.println("0");
    }else if(num==2)
    {
      System.out.println("1");
    }
    else{

      for (int i = 3; i <= num; i++) {
        
        z = x + y;
        x = y;
        y = z;

      }

      System.out.println(y);

    }

    in.close();
  }
}
