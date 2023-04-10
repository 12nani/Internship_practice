import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int prod = 0,digit;
        while (number > 0) {
          digit = number % 10;
          prod = prod * digit;  
          number = number / 10;   
        }
        System.out.println(prod);
    }
}
