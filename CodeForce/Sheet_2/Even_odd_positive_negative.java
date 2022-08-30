import java.util.Scanner;

public class Even_odd_positive_negative {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int n = in.nextInt();
    long inner_input;
 
    int even=0,odd=0,pos=0,neg=0;
 
    while(n!=0)
    {
      inner_input = in.nextLong();
 
      if(inner_input % 2 ==0)
      {
        even++;
      }
 
      if(inner_input % 2 ==1 || inner_input % 2 == -1)
      {
        odd++;
      }
 
      if(inner_input > 0)
      {
        pos++;
      }
 
      if(inner_input < 0)
      {
        neg++;
      }
      n--;
    }
 
    System.out.printf("Even: %d\n",even);
    System.out.printf("Odd: %d\n",odd);
    System.out.printf("Positive: %d\n",pos);
    System.out.printf("Negative: %d\n",neg);;
 
    in.close();
  }
}
