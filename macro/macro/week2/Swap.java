public class Swap
  {
    public static void main(String[] args)
      {
        int a = 10;
        int b = 20;
        System.out.println("value of a and b before swapping, a:" + a +" b:" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a and b after swapping, a:" + a +" b:" + b);
        
      }
  }