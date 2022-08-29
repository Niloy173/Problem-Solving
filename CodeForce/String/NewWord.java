import java.util.Scanner;

public class NewWord {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int count1=0,count2=0,count3=0,count4=0,count5=0;

    String str = in.next();
    str = str.toLowerCase();
   
    for (int i = 0; i < str.length(); i++) {
      
      if(str.charAt(i) == 'e')
      {
        count1++;
      }
      else if(str.charAt(i) == 'y'){
        count2++;
      }
      else if(str.charAt(i) == 'g')
      {
        count3++;
      }
      else if(str.charAt(i) == 'p')
      {
        count4++;
      }
      else if(str.charAt(i) == 't')
      {
        count5++;

      }
    }

    int arr[] = { count1,count2,count3,count4,count5};
    int min = 9128382;

    for (int i : arr) {
      
      if(i < min)
      {
        min = i;
      }
    }

    System.out.println(min);
    in.close();
  }
}
