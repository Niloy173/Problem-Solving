
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Closest {

  

 
  
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int x,y;

   x = input.nextInt();

  int[] Arr = new int[x];

  for(int i=0;i<x;i++)
  {
    y = input.nextInt();
    Arr[i] = y;
  }

   Arrays.sort(Arr);


  

  int current = 1000;

  for(int i=0;i<x-1;i++)
  {
    int miniDiff = Arr[i+1] - Arr[i];
   
    if(miniDiff < current)
    {
      current = miniDiff;
    }
  }

 
  
 ArrayList<Integer> combination = new ArrayList<Integer>();

 for(int i=0;i<x-1;i++)
 {
   if(Math.abs(Arr[i]-Arr[i+1])== current)
   {
      combination.add(Arr[i]);
      combination.add(Arr[i+1]);
   }
  
 }


 for(int i=0;i<combination.size();i++)
 {
   System.out.printf("%d ",combination.get(i));
 }

  


  input.close();
 }
  
}
