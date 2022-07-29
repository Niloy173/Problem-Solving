import java.util.Scanner;

public class SmallestPair {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int caseNo = in.nextInt();
    
    while (caseNo!=0) {

      int size = in.nextInt();
      int[] arr = new int[size];

      for (int i = 0; i < size; i++) {
        arr[i] = in.nextInt();
      }
      int small = 99999999;

      for (int i = 0; i < size; i++) {

        for (int j = i+1; j < size; j++) {
          
          int result = arr[i] + arr[j]+j-i;
          if(result < small)
          {
            small = result;
          }

        }
        
      }
      System.out.println(small);
      
      caseNo--;
    }

    in.close();
  }
}
