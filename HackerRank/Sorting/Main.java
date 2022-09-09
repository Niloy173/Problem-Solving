import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int middle = x / 2;
    int arr[] = new int[x];

    for (int i = 0; i < x; i++) {
        
        arr[i] = in.nextInt();
    }

    //int temp = 0;
    // for(int i=0;i<arr.length;i++)
    // {
    //     for (int j = i+1; j < arr.length; j++) {
            
    //         if(arr[i] > arr[j])
    //         {
    //             temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    // }
    Arrays.sort(arr);
    

    System.out.printf("%d\n",arr[middle]);

    

    in.close();
}
}
