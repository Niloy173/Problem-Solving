import java.util.HashMap;
import java.util.Scanner;

public class CountingPart {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int arr[] = new int[n];
    HashMap<Integer,Integer> counter = new HashMap<>();

    for (int i = 0; i < n; i++) {
        
        arr[i] = in.nextInt();
        if(counter.containsKey(arr[i]))
        {
            int d = counter.get(arr[i]);
            counter.put(arr[i], d+1);
        }else{
            counter.put(arr[i], 0);
        }
    }

    for(int i=0;i<100;i++)
    {
        if(counter.containsKey(i))
        {
            System.out.printf("%d ",counter.get(i)+1);
        }else
        {
            System.out.printf("0 ");
        }
    }
    in.close();
}
}
