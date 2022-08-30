import java.util.Scanner;

public class Three_number {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
 
    int k = in.nextInt();
    int s = in.nextInt();
    int count =0;
 
    for(int i=0;i<=k;i++)
    {
      for(int j=0;j<=k;j++)
      {
        if((s-i-j) >=0 && (s-i-j)<=k)
        {
          count++;
        }
      }
    }
 
    System.out.println(count);
    in.close();
  }
}
