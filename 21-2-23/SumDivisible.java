import java.util.Scanner;

public class SumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer value for n: ");
        int n = sc.nextInt();
        int i=1,sum = 0;
        while (i <= n) {
            if (i % 5 == 0) {
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
