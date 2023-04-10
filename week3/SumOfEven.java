import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int n,i=2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        while(i<=n);
      {
          sum = sum +i;
          i=i+2;
        
      }
    }
}