import java.util.Scanner;

public class Palindrome {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    long arr[] = new long[size];
    long reverse[] = new long[size];

    for (int i = 0; i < size; i++) {
      
      arr[i] = in.nextLong();
    }

    int j=0;
    for (int i = size-1; i >=0; i--) {
      reverse[j++] = arr[i];
    }

    int boo = 0;
    for (int i = 0; i < size; i++) {
      
      if(arr[i] != reverse[i])
      {
        boo = 1;
        break;
      }
    }

    if(boo == 1)
    {
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }

    in.close();

  }
}
