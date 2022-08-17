import java.util.Scanner;

/**
 * Create_A_New_String
 */
public class Create_A_New_String {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s1 = in.next();
    String s2 = in.next();

    System.out.println(s1.length()+" "+s2.length());
    System.out.println(s1+" "+s2);

    in.close();
  }
}