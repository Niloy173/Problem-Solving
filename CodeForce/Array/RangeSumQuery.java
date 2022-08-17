import java.util.Arrays;
import java.util.Scanner;

public class RangeSumQuery {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int Q = in.nextInt();

    long arr[] = new long[N+1];

    for (int i = 1; i <=N; i++) {
      arr[i] = in.nextLong();
    }

    for (int i = 0; i < Q; i++) {
      int L = in.nextInt();
      int R = in.nextInt();

      long sum =0;
      long new_arr[] = Arrays.copyOfRange(arr, L, R+1);

      sum = Arrays.stream(new_arr).sum();

      System.out.println(sum);
    }
    in.close();
  }
}
