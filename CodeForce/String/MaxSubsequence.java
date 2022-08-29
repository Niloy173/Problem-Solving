import java.util.Scanner;

public class MaxSubsequence {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();
    String input = in.next();

    int sum_ =1;

    for (int i = 1; i <=size-1; i++) {

      if(input.charAt(i) == input.charAt(i-1))
      {
        continue;
      }else{
       
        sum_++;
      }
      
    }
    System.out.println(sum_);
    in.close();
  }

}
