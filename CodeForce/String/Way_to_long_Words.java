import java.util.Scanner;

public class Way_to_long_Words {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int case_no = in.nextInt();


    while(case_no !=0)
    {
      String s = in.next();

      if(s.length() > 10)
      {
        char[] new_s = s.toCharArray();
        String val = String.valueOf(new_s[0])+String.valueOf(new_s.length-2)+String.valueOf(new_s[new_s.length-1]);
        System.out.println(val);
      }else{
        System.out.println(s);
      }
      case_no--;
    }

    in.close();
  }
}
