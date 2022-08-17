import java.util.Scanner;

public class Lowest {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    int arr[] = new int[size];
    

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }

    int min = arr[0];
    int min_index = 0;
    for (int i = 1; i < size; i++) {
      
      if(arr[i] < min)
      {
        min = arr[i];
        min_index = i;
      }
    }
    System.out.printf("%d %d\n",min,++min_index);


    in.close();
  }
}
