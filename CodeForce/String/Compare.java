import java.util.Scanner;

public class Compare {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s1 = in.next();
    String s2 = in.next();

  int res = s1.compareTo(s2);

  if(res == 0)
  {
    System.out.println(s1);
  }else if(res > 0)
  {
    System.out.println(s2);
  }else{

    System.out.println(s1);
  }

    

    
  
    
    in.close();
  }
}
