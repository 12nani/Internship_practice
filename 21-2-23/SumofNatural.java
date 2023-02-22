import java.util.Scanner;

public class SumofNatural{
    public static void main(String[] args) {
        int num, i = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
