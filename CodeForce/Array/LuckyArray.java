import java.util.Scanner;

public class LuckyArray {
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    int[] arr = new int[size];
    int min = 999999;

    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
      if(arr[i] < min)
      {
        min = arr[i];
      }
    }

    int count =0;
    for (int i = 0; i < arr.length; i++) {
      
      if(arr[i] == min)
      {
        count++;
      }
    }

    if(count%2==0)
    {
      System.out.println("Unlucky");
    }else{
      System.out.println("Lucky");
    }

    in.close();
  }

}
