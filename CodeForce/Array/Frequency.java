import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    int data[] = new int[N];
    HashMap<Integer,Integer> map = new HashMap<>(N);

    for (int i = 0; i < N; i++) {
      
      data[i] = in.nextInt();
      if(map.containsKey(data[i]))
      {
        map.put(data[i],map.get(data[i])+1);
      }else{
        map.put(data[i],1);
      }
    }
   
    for (int i = 0; i < M; i++) {
      System.out.println(map.get(data[i]));
    }


    in.close();
  }
}
