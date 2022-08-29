import java.util.Scanner;

public class Palindrome {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s1 = in.next();
    
    String s2 = "";
    for (int i = s1.length()-1; i >=0; i--) {
      s2 += String.valueOf(s1.charAt(i));
      
    }

    if(s1.equals(s2))
    {
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

    in.close();

    
  }
}
