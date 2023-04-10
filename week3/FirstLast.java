// import java.util.Scanner;

// public class FirstLast {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a number: ");
//       int num = sc.nextInt();
//       int first = 0, last=0;
//            last = num % 10;
//       while (num !=0) {
//          first = num%10;
//          num=num/10;
//       }

//       System.out.println("First digit: " + first);
//       System.out.println("Last digit: " + last);
//    }
// }
import java.util.*;
class FirstLast  {
  public static void main(String args[])
  {      
    Scanner sc=new Scanner(System.in);   
    System.out.println("Enter n value"); 
    int n=sc.nextInt();     
    int lastdigit=n%10;      
    while(n>10){     
      n=n/10;     
    }  
    int firstdigit=n;  
    int sum=0;
    sum=firstdigit+lastdigit;
    System.out.println("sum "+sum);
    System.out.println("firstdigit "+firstdigit);   
    System.out.println("lastdigit "+lastdigit);      
  
  } 
}