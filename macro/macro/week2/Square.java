import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the side length of the square: ");
    int side = input.nextInt();
    int area = side * side;
    int perimeter = side * 4;
    System.out.println("The area of the square is: " + area);
    System.out.println("The perimeter of the square is: " + perimeter);
  }
}
