import java.util.Scanner;

public class Sorting {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }

    int temp =0;
    for (int i = 0; i < arr.length-1; i++) {
      
      if(arr[i] > arr[i+1])
      {
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;

        i=-1;
      }
      

    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }

    in.close();
  }
}
