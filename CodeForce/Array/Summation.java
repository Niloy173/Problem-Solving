import java.util.Scanner;

public class Summation {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    long sum =0;
    long arr[] = new long[size];

    for (int i = 0; i < size; i++) {
      
      arr[i] = input.nextLong();
      sum +=  arr[i];
      
    }
    System.out.println(Math.abs(sum));



    input.close();
  }
}
