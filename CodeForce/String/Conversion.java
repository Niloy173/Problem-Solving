import java.util.Scanner;

public class Conversion {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s1 = in.nextLine();

    String replaceString = s1.replaceAll(",", " ");

    char [] new_s1 = replaceString.toCharArray();
    char ch;

    

    for (int i = 0; i < new_s1.length; i++) {
      
     if(Character.isLowerCase(new_s1[i]) && new_s1[i] !=' ')
     {
       ch = Character.toUpperCase(new_s1[i]);
       new_s1[i] = ch;
     }else if(Character.isUpperCase(new_s1[i]) && new_s1[i] !=' ')
     {
      ch = Character.toLowerCase(new_s1[i]);
      new_s1[i] = ch;
     }
    }

    for (char c : new_s1) {
      System.out.printf("%c",c);
    }
    System.out.println();

    in.close();
  }
}
