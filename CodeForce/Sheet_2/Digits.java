import java.util.Scanner;

public class Digits {
  
  static void PrintReverse(String num)
  {
 
 
    for (int i = num.length()-1; i>=0; i--) {
      
      System.out.printf("%c ",num.charAt(i));
    }
    System.out.printf("\n");
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int case_ = in.nextInt();
    String num;
 
    for(int i=0;i<case_;i++)
    {
       num = in.next();
     
      PrintReverse(num);
    }
    
 
    in.close();
  }
}
