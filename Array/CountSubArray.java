import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountSubArray {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int test_case = in.nextInt();

    while(test_case-- !=0){

      int n = in.nextInt();
      int arr[] = new int[n];
      int ind=0;

      HashMap<Integer,int[]> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt();
        map.put(ind++, new int[]{arr[i]});
      }

      
      if(n == 1){
        System.out.println("1");
      }else{

        for (int i = 0; i < arr.length; i++) {
          
         for (int j = i+1; j < arr.length; j++) {
          
            int new_arr[] = Arrays.copyOfRange(arr,i,j+1);
            int clone_arr[] = new_arr.clone();
            Arrays.sort(clone_arr);
            Boolean v = Arrays.equals(new_arr, clone_arr);
            if(v){
              map.put(ind++, new_arr);
            }
            
          }
        }

        System.out.println(map.size());
        
      }
    }
    in.close();
  }
}
