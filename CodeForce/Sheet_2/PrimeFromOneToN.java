import java.util.Scanner;

public class PrimeFromOneToN {
  static int CheckPrime(int v)
  {
 
    int boo = 0;
    if(v == 2)
    {
      return 1;
    }else{
 
      for(int i=2;i<v;i++)
      {
        if(v % i == 0)
        {
          boo=1;
          break;
        }
      }
 
      if(boo==1)
      {
        return 0;
      }else{
        return 1;
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
 
    int num = in.nextInt();
    
 
    for(int i=2;i<=num;i++)
    {
     int d = CheckPrime(i);
     if(d == 1)
     {
       System.out.printf("%d ",i);
     }
    }
    System.out.printf("\n");
 
 
    in.close();
  }
}
