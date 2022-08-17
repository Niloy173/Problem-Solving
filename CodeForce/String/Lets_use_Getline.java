import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Lets_use_Getline {
 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    String s1 = in.nextLine();
    
    String[] splited = s1.split(Pattern.quote("\\"));
 
    System.out.println(splited[0]);
 
    in.close();
  }
  
}