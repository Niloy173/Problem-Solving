import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * FunnyString
 */
public class FunnyString {

  public static int pass(int x ,int y)
  {
    
    return Math.abs(x-y);

  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int case_in = input.nextInt();
    int i,j,k,l,m,n;

    for( i=0;i<case_in;i++)
    {
      String in_input = input.next();

      String in_rev = "";
      int ind3=0,ind4=0;

    for( j=in_input.length()-1;j>=0;j--)
    {
      in_rev += in_input.charAt(j);
    }

    

    int[] firstData = new int[in_input.length()];
    int[] SecondData = new int[in_rev.length()];

    for( k=0;k<in_input.length();k++)
    {
      char charcter = in_input.charAt(k);
      int ascii = (int) charcter;
      firstData[ind3++]= ascii;
    }
    

    for( l=0;l<in_rev.length();l++)
    {
      char charcter = in_rev.charAt(l);
      int ascii = (int) charcter;
      SecondData[ind4++] = ascii;
    }


   

    List<Integer> lis1 = new ArrayList<>();
    for( m=0;m<firstData.length-1;m++)
    {
       int result = pass(firstData[m],firstData[m+1]);
       lis1.add(result);
    }

    List<Integer> lis2 = new ArrayList<>();
    for( n=0;n<SecondData.length-1;n++)
    {
       int result = pass(SecondData[n],SecondData[n+1]);
       lis2.add(result);
    }

   

    if(lis1.equals(lis2))
    {
      System.out.println("Funny");
    }else{
      System.out.println("Not Funny");
    }

 

    }
    

   
  }
  
}