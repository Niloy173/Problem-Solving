import java.util.Scanner;

public class URL {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.next();

    String[] split = str.split("&");
    String[] token = {"username","pwd","profile","role","key"};
    int i=0;

    for (String string : split) {
      
     System.out.println(token[i++] + ": "+string.split("=")[1]);
    }

    in.close();
  }
}
