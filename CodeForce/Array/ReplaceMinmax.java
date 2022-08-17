import java.util.Scanner;

/**
 * ReplaceMinmax
 */
public class ReplaceMinmax {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int arr[] = new int[size];
    int max=-1, min=9999999;
    int max_ind=0,min_ind=0,temp=0;

    for (int i = 0; i < size; i++) {
      
      arr[i] = input.nextInt();
      if(arr[i] > max)
      {
        max = arr[i];
        max_ind = i;
      }
      if(arr[i] < min){
        min = arr[i];
        min_ind = i;
      }
    }

   temp = arr[max_ind];
   arr[max_ind] = arr[min_ind];
   arr[min_ind] = temp;

   for (int i = 0; i < arr.length; i++) {

    System.out.print(arr[i]+" ");
   }
   System.out.println();
    




    input.close();
  }
}