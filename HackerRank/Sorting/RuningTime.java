

import java.util.Scanner;

public class RuningTime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int steps = 0;

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      
        arr[i] = in.nextInt();
    }

    int key=0,j;
    for (int i = 1; i < arr.length; i++) {
        
        key = arr[i];
        j= i-1;
        
        while(j>=0 && arr[j] > key)
        {
            arr[j+1] = arr[j];
            j=j-1;
            steps++;
        }
        arr[j+1] = key;
    }
    System.out.println(""+steps);

    in.close();
}
}
