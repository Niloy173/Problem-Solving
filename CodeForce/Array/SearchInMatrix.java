import java.util.Scanner;

public class SearchInMatrix {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int M = in.nextInt();

    int arr[][] = new int[N][M];

    for(int i=0;i<N;i++)
    {
      for(int j=0;j<M;j++){

        arr[i][j] = in.nextInt();
      }
    }
    int v = in.nextInt();
    int boo = 0;
   
    for(int i=0;i<N;i++)
    {
      for (int j=0; j<M; j++) {
        
        if(arr[i][j] == v){
          boo++;
          break;
        }
      }

      if(boo == 1){
        break;
      }
    }
    if(boo == 0){
      System.out.println("will take number");
    }else{

      System.out.println("will not take number");
    }

    in.close();
  }
}
