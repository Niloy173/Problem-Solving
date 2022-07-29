import java.util.Scanner;

public class CheckCode {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A,B;
    String S;
    A = in.nextInt();
    B = in.nextInt();
    S = in.next();

    int boo = 0;
    if(S.charAt(A) == '-')
    {
      for (int i = 0; i < S.length(); i++) {

        if(S.charAt(i) == '-')
        {
          continue;
        }
        if(!Character.isDigit(S.charAt(i)))
        {
          boo=1;
          break;
        }
        
      }
      
        if(boo == 1)
        {
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }
    }else{
      System.out.println("No");
    }



    in.close();
  }
}
