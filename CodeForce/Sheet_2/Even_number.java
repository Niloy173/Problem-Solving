import java.util.Scanner;

public class Even_number {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    int n = in.nextInt();
    int boo = 0;
   
    for(int i=1;i<=n;i++)
    {
      if(i % 2 == 0)
      {
        boo = 1;
        System.out.println(i);
      }
    }
    if(boo == 0)
    {
      System.out.println("-1");
    }
   
    in.close();
   }
}
