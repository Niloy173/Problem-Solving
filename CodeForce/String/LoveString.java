import java.util.Scanner;

public class LoveString {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   

    int case_no = in.nextInt();
    in.nextLine();
   
    while(case_no !=0)
    {
      String[] splited_str = in.nextLine().split(" ");
      
     String FirstPart = splited_str[0];
     String SecondPart = splited_str[1];

     String result = "";
     

     int max = Math.max(FirstPart.length(), SecondPart.length());
     int min = Math.min(FirstPart.length(),SecondPart.length());

     for (int i = 0; i < min; i++) {
      
      result += FirstPart.charAt(i);
      result += SecondPart.charAt(i);
    }

     if(FirstPart.length() == SecondPart.length())
     {

      System.out.println(result);

     }else{

    

     if(FirstPart.length() == max){

      for (int i = min; i < max; i++) {
        result += FirstPart.charAt(i);
      }

     }else{

      for (int i = min; i < max; i++) {
        result += SecondPart.charAt(i);
      }

     }
    
     System.out.println(result);

     }

      case_no --;

    }

    

    in.close();
    
   

    
  }
}
