import java.util.Arrays;
import java.util.Scanner;

public class Demo {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int data,x=2,y=3;
   
  
    System.out.println("Size of the Array");
    int size = input.nextInt();
     

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      
      data = input.nextInt();
      arr[i] = data;
    }

    System.out.println(Arrays.toString(arr));


    input.close();
  }
}
