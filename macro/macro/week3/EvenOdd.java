import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();
        System.out.println("\neven");
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nodd");
        for (int j=1; j<=n; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        } 
    }
}