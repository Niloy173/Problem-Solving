import java.util.Scanner;

public class Count {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String S = in.next();

    char[] arr_S = S.toCharArray();
    int sum =0;

    for (int i = 0; i < arr_S.length; i++) {
      
      sum += Integer.parseInt(String.valueOf(arr_S[i]));

    }

    System.out.println(sum);

    in.close();
  }
}
