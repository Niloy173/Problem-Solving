import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Letters {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s1 = in.next();

    Map<Character,Integer> map = new HashMap<>();

  
    for (int i = 0; i < s1.length(); i++) {
      
      if(map.containsKey(s1.charAt(i)))
      {
        map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
      }else{
        map.put(s1.charAt(i), 1);
      }
    }

    
    map.keySet().stream().sorted().forEach(s -> {

      System.out.println(s+" : "+map.get(s));
    });
    


  

    





    in.close();
  }
}
