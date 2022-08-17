import java.util.Scanner;

public class MirorArray {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    long arr[][] = new long[N][M];
    
    for (int i = 0; i < N; i++) {
      
      for (int j = 0; j < M; j++) {

        arr[i][j] = in.nextLong();
        
      }
    }

    int start , end;
    for (int i =0; i< arr.length ; i++) {
      
      start = 0;
      end = arr.length-1;
        while(start <=end)
        {
          long temp = arr[i][start];
          arr[i][start] = arr[i][end];
          arr[i][end] = temp;

          start++;
          end--;

        }
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }


    in.close();
  }
}
