import java.util.Scanner;

public class MinimizeNumber {

  public static Boolean result(Long num)
  {

    if(num % 2 !=0)
    {
      return false;
    }
    return true;

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int size = in.nextInt();
    long[] arr = new long[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextLong();
    }


   long operation = 0;
   long temp =0;
   while (true) {

    for (int i = 0; i < arr.length; i++) {
      Boolean checker = result(arr[i]);
      if(checker)
      {
        temp++;
      }
      
    }
   
    if(temp == arr.length)
    {
      operation++;
      for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] - (arr[i]/2);
      }
      temp=0;
    }else{
      break;
    }
   

    
   }
   System.out.println(operation);



    in.close();
  }
  
}