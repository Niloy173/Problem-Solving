import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Lilly {


    public static int Get_me_result(int arr[]) {
        
        
        int sorted_arr[] = arr.clone();
        
        
        //System.out.println(Arrays.toString(sorted_arr));

        HashMap<Integer,Integer> store_value = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            store_value.put(arr[i], i);
        }

        Arrays.sort(sorted_arr);

        int steps =0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] != sorted_arr[i])
            {

                steps ++;
               // System.out.println(store_value.toString());

                int temp = store_value.get(sorted_arr[i]);
                
                store_value.put(arr[i], temp);
                
                //additional
                store_value.put(arr[temp], i);

                
                int d = arr[i];
                arr[i] = arr[temp];
                arr[temp] = d;

            }
        }

        return steps;

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];
        
        

        for (int i = 0; i < n; i++) {
            
            
            arr[i] = in.nextInt();
           
        }

        int[] reverse_arr = new int[arr.length];
        int k=0;
        
        for (int i = arr.length-1; i >=0; i--) {

            reverse_arr[k++] = arr[i];
            
        }
       
     

        int normal_order = Get_me_result(arr);
        int reverse_order = Get_me_result(reverse_arr);
        
        

       System.out.println(""+Math.min(normal_order,reverse_order));
    

        in.close();
    }
}
