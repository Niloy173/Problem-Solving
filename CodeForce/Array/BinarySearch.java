import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static boolean Search(long[] arr,long val)
  {
    int start=0, end = arr.length -1;

   

    int boo = 0;
    while(start <= end){

      int mid =(start + end) / 2;
      if(arr[mid] == val){
        boo = 1;
        break;
      }

      else if(arr[mid] > val){
        end = mid - 1;
      }else{
        start = mid + 1;
      }
    }


    if(boo ==1){
      return true;
    }else{
      return false;
    }

  }
  
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int Q = in.nextInt();
    long arr[] = new long[N];

    for(int i=0;i< N;i++){
      arr[i] = in.nextLong();
    }
    Arrays.sort(arr);

    for(int i=0;i<Q;i++)
    {
      long x = in.nextLong();
      Boolean res = Search(arr,x);

      if(res){
        System.out.println("found");
      }else{
        System.out.println("not found");
      }
    }
    in.close();
  }
}
