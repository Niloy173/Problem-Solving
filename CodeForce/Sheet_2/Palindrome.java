import java.util.Scanner;

public class Palindrome {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    long number = in.nextLong();
    long temp=0,reverse =0,actual=number;
 
    // reverse the number
    while (actual !=0) {
      
      
      temp = actual % 10;
      reverse =(reverse *10) + temp;
      actual = actual / 10;
 
    }
 
    System.out.println(reverse);
    if(reverse == number)
    {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
 
    in.close();
  }
}
