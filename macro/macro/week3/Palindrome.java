import java.util.Scanner;
public class Palindrome  {
    public static void main(String args[])
    {
	   Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int pal = 0, r;
	   int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        pal = (pal*10)+r;    
        n = n/10;    
      }    
      if(temp==pal)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
     }  
}
