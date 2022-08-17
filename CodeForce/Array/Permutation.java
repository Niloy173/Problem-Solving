import java.util.Scanner;
 
/**
 * Sort Both Array
 * if any element didn't match then print "no" otherwise "yes"
 */
public class Permutation {
 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int size = in.nextInt();
 
    long A[] = new long[size];
    long B[] = new long[size];
 
    for (int i = 0; i < size; i++) {
      A[i] = in.nextLong();
      
    }
 
    for (int i = 0; i < size; i++) {
      B[i] = in.nextLong();
    }
 
    long temp1=0;
    for (int i = 0; i < size-1; i++) {
      
      if(A[i] > A[i+1])
      {
        temp1 = A[i];
        A[i] = A[i+1];
        A[i+1] = temp1;
 
      }
    }

    // System.out.println(Arrays.toString(A));
 
    long temp2=0;
    for (int i = 0; i < size-1; i++) {
      
      if(B[i] > B[i+1])
      {
        temp2 = B[i];
        B[i] = B[i+1];
        B[i+1] = temp2;
 
      }
    }
    // System.out.println(Arrays.toString(B));
 
    int boo=0;
    for (int i = 0; i < size; i++) {
 
      if(A[i] != B[i])
      {
        boo = 1;
        break;
      }
 
      
    }
 
    if(boo == 1)
    {
      System.out.println("no");
    }else{
      System.out.println("yes");
    }
 
    in.close();
  }
}