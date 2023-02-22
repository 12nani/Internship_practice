import java.util.Scanner;

public class FirstLast {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      int first = 0, last=0;
      while (first !=0) {
         first = num%10;
         num=num/10;
      }
      last = num % 10;
      System.out.println("First digit: " + first);
      System.out.println("Last digit: " + last);
   }
}