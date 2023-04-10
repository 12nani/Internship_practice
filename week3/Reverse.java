import java.util.Scanner;
public class Reverse 
{
    public static void main(String args[])
    {
        int num, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        while(num > 0)
        {
            temp = num % 10;
            sum = sum * 10 + temp;
            num = num / 10;
        }
        System.out.println(sum);
    }
}