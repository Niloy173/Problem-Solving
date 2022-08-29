
import java.util.Scanner;

public class Subsequence {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
   

    String input = in.next();

    String compareString = "hello";
    int j=0,count=0;

    for (int i = 0; i < input.length(); i++) {
      
      if(input.charAt(i) == compareString.charAt(j))
      {
        j++;
      }

      if(j== 5){
        count++;
        break;
      }

    }

    if(count == 1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

   

    in.close();

   

  }
  
}
