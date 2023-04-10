import java.util.*;
class Dish{
  String name;
  int ingredients;
  int price;
}
class Restaurant{
  int n=3;
  Dish e[]=new Dish[n];
  Scanner sc = new Scanner(System.in);
  void addDish(){
    for(int i=0; i<n; i++){
      e[i]=new Dish();
    System.out.println("enter the dish u want to add");
      e[i].name=sc.next();
      System.out.println("enter how many ingred u want to add");
      e[i].ingredients=sc.nextInt();
      System.out.println("enter the price of the dish");
      e[i].price=sc.nextInt();
  }   
  }
  void removeDish(){
    int index =-1;
    System.out.println("Enter the dish name you want to remove");
    String rem = sc.next();
    for(int i =0; i<e.length; i++){
    if(rem.equals(e[i].name)){
      index=i;
      break;
    }
    }
    if(index>=0){
      for(int i =index; i<e.length-1; i++){
      e[i]=e[i+1];
    }
      n--;
      display();
    }
 
  }
    void display(){
      for(int i=0; i<e.length; i++){
        System.out.println((i+1)+". "+e[i].name+" "+e[i].ingredients+" "+e[i].price);
      }
    }
}
class Restaurant1{
  public static void main(String args[]){
    Restaurant d=new Restaurant();
    d.addDish();
    d.removeDish();
  //  d.display();
  }
}