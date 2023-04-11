// Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message. 

// Here's a sample input and output for the above question: 

// ------------------------------------------------------------- 

// Sample Input: 

// A = [23,45,67,78,86,90] 

// Target element is: 67 

// Expected Output: 

// 67 is present in 2nd index position and it is a prime number 

// Sample Input: 

// A = [23,45,67,78,86,90] 

// Target element is: 86 

// Expected Output: 

// 86 is present in 4th index position and it is not a prime number 
import java.util.*;

public class BinarySearch {

  public static void main(String args[])
  {
    int N[]={10,20,30,40,50,60};
    int dest;

    Scanner sc=new Scanner(System.in);
    System.out.println("element to search is");
    dest=sc.nextInt();

    int index=binarySearch(N,dest);
    if(index!=-1){
      System.out.println("the element is present in"+index);
      if(isPrime(dest))
      {
        System.out.println("number is prime");
      }
      else{
        System.out.println("number is not prime");
      }
    }
  
  public static int binarySearch(int[] N,int dest)
  {
    int low =0;
    int high=N.Length-1;

    while (low<=high){
      int mid=(low+high)/2;
      if(N[mid==dest]){
        return mid;
      }
      else if(N[mid]<dest){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
      
    }
  }

}