import java.util.Scanner;

public class Searching {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    long arr[] = new long[n];

    for(int i=0;i<n;i++)
    {

        arr[i] = input.nextLong();
    }

    long element = input.nextLong();
    int boo = 0;

    
    for (int i = 0; i < n; i++) {
        
        if(arr[i] == element)
        {
            boo = 1;
            System.out.println(""+i);
            break;
        }
    }

    if(boo == 0)
    {
        System.out.println("-1");
    }
   

    input.close();
  }
}
