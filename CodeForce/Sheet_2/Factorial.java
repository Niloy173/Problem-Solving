import java.util.Scanner;

public class Factorial {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int c = in.nextInt();
    int num;
   
 
    while(c !=0)
    {
 
      num = in.nextInt();
      long  r =1;
 
      if(num ==1 || num==0)
      {
        System.out.println("1");
      }else{
 
      for(int i=num;i>=1;i--)
      {
        r *=i;
 
      }
      System.out.println(r);
    
      }
     
      
      c--; 
    }
 
   
 
 
    in.close();
  }
}
