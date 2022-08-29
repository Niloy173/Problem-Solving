import java.util.Scanner;

public class Reverseword {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();

    String temp ="";
    for (int i = 0; i < str.length(); i++) {
      
      if(str.charAt(i) == ' ')
      {
        String dummy = "";
        for (int j = temp.length()-1; j >=0; j--) {
          dummy += temp.charAt(j);
        }
        System.out.print(dummy+" ");
        temp = "";
      }else{

        temp += str.charAt(i);
        if(i == str.length()-1)
        {
          String dummy = "";
          for (int j = temp.length()-1; j >=0; j--) {
            dummy += temp.charAt(j);
          }
          System.out.print(dummy);
        }
      }
    }


    in.close();
  }
}
