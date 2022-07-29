import java.util.Scanner;

public class Replacement {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      
      arr[i] = in.nextInt();
    }

    for(int i=0; i<size;i++)
    {
      if(arr[i] == 0)
      {
        continue;
      }else{
        
        if(arr[i] > 0)
        {
          arr[i] = 1;
        }else{
          arr[i] = 2;
        }

      }
    }

   for (int i = 0; i < size; i++) {
    System.out.printf("%d ",arr[i]);
   }
   System.out.println();
    in.close();
  }
}
