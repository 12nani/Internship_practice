import java.util.*;
class Factor  
{   
  public static void main(String args[]){      
    Scanner sc=new Scanner(System.in);   
    System.out.println("Enter n value");   
    int n=sc.nextInt();     
    int fact=1;  
    for(int i=1;i<=n;i++){    
      fact=i*fact;      
    }  
    System.out.println(fact);     
  }  
} 