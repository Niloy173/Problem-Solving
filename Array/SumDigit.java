import java.util.Scanner;

public class SumDigit {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    String digits = in.next();
    int result =0;

    for (int i = 0; i < digits.length(); i++) {
      result += Integer.parseInt(String.valueOf(digits.charAt(i)));
    }
    System.out.println(result);


    in.close();
  }
}
