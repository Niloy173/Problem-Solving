import java.util.Scanner;

public class Strings {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String A = in.next();
    String B = in.next();

    char[] newA = A.toCharArray();
    char[] newB = B.toCharArray();

    System.out.println(A.length()+" "+B.length());
    System.out.println(A+B);

    char temp = newA[0];
    newA[0] = newB[0];
    newB[0] = temp;

    for (char c : newA) {
      System.out.printf("%c",c);
    }
    System.out.printf(" ");

    for (char c : newB) {
      System.out.printf("%c",c);
    }
    System.out.println();

    in.close();
  }


}
