import java.util.Scanner;

public class Reverse {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();
    long arr[] = new long[size];

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextLong();
    }

    for (int i = size-1; i >=0; i--) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();

    in.close();
  }
}
