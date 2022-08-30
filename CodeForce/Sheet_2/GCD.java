import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCD {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int v1 = in.nextInt();
    int v2 = in.nextInt();
 
    int max = Math.max(v1, v2);
    List<Integer> result = new ArrayList<>();
 
    for (int i = 1; i <=max; i++) {
      
      if(v1 % i==0 && v2 % i==0)
      {
        result.add(i);
      }
    }
    int answer = 0;
 
    for (Integer i : result) {
      
      if(i > answer)
      {
        answer = i;
      }
 
    }
 
    System.out.println(answer);
 
 
   
 
   
    in.close();
  }
}
