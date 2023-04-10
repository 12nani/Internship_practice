import java.util.*;
public class Prime{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
    int count=0;
     for(int i=2;i<n/2;i++)
       {
         if(n%i==0)
         {
           System.out.println("is not prime");
           count=1;
           break;
         }  
       }
    if(count==0)
    {
      System.out.println("is prime");
    }
  }
}