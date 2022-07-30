import java.util.Scanner;

public class Subsequence {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    long A[] = new long[N];
    long B[] = new long[M];

    for (int i = 0; i < N; i++) {
        A[i] = in.nextLong();
    }
    for (int i = 0; i < M; i++) {
      B[i] = in.nextLong();
  }


    int count=0,start=0;
    for (int i = 0; i < B.length; i++) {
      
      for (int j = start; j < A.length; j++) {
        
        if(B[i] == A[j])
        {
          count++;
          start = j+1;
          break;
        }
      }
      
      if(count == 0)
      {
        break;
      }

    }

    if(count == B.length){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    





    in.close();
  }
}
