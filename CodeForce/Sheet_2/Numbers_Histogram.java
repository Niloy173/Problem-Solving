import java.util.Scanner;

public class Numbers_Histogram {
  
  static void PrintPattern(int num, String symbol) {
 
    for(int i=1;i<=num;i++)
    {
      System.out.print(symbol);
    }
    System.out.printf("\n");
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
 
 
    
 
    String Symbol;
    int N;
    int num;
 
    Symbol = in.nextLine();
    N = in.nextInt();
 
    for(int i=1;i<=N;i++)
    {
      num = in.nextInt();
      PrintPattern(num,Symbol);
    }
 
    in.close();
 
 
 
 
 
 
  }
}
