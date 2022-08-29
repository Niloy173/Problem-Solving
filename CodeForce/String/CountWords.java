import java.util.Scanner;

public class CountWords {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   

    String str = in.nextLine();

    int count =0;
    String temp = "";
    for (int i = 0; i < str.length(); i++) {

      if(str.charAt(i) != '.' && str.charAt(i) != '?' && str.charAt(i) != ',' && str.charAt(i) != ' ' && str.charAt(i) != '!')
      {
        temp += str.charAt(i);
      }

      
      if((str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == ',' || str.charAt(i) == ' ' || str.charAt(i) == '!' || i == str.length()-1) && temp.length() !=0 )
      {
        count++;
        temp = "";
      }
     
    }

    
    

    System.out.println(count);

    in.close();
  }
}
