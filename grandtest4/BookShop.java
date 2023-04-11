
// As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects. 
// Your task is to create a Java program that helps you manage the book shop efficiently.  
// Create a console-based menu-driven program that allows the user to perform the following operations: 
// 1. Add books 
// 2. Calculate total price of all books 
// 3. Remove a book by book_id 
// 4. Update book price by book_id 
// 5. Search books by author 
// 6. Quit the program 
// If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 
// Each menu option should call the corresponding method and display the results or appropriate error messages. 
import java.util.ArrayList;
import java.util.*;

class Book {
  private int id;
  private String title;
  private String author;
  private double cost;

  public Book(int id, String title, String author, double cost) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.cost = cost;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

}

public class BookShop {
  static ArrayList<Book> books=newArrayList< >();
  static Scanner sc = new Scanner(System.in);

  public static void addBooks() {
    System.out.println("Enter the total books you want to add");
    int totBooks = sc.nextInt();
    for (int i = 0; i < totBooks; i++) {
      System.out.println("book id: ");
      int bookId = sc.nextInt();

      System.out.println("title: ");
      String title = sc.nextLine();

      System.out.println("author: ");
      String author = sc.nextLine();

      System.out.println("cost: ");
      double cost = sc.nextDouble();

      book.add(new Book(bookId, title, author, cost));
    }
  }

  public static void calculateCost() {
    double totalCost = 0;
    for (Book book : books) {
      totalCost = totalCost + book.getCost();
    }
    System.out.println("Total cost of the books are: " + totalCost);
  }

  public static void removeBooks() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the book id to remove: ");
    int id = sc.nextInt();
    boolean removed = false;
    for (int i = 0; i < bookList.size(); i++) {
      if (bookList.get(i).getId() == id) {
        bookList.remove(i);
        removed = true;
      }
    }
    if (removed == true) {
      System.out.println("book removed sucessfully");
    } else {
      System.out.println("book not found");
    }
  }

  public static void updateBooks() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the book you want to update");
    int id = sc.nextInt();
    boolean update = false;
    for (int i = 0; i < bookList.size(); i++) {
      if (bookList.get(i).getId == id) {
        System.out.println("enter updated price");
        double cost = sc.nextdouble();
        bookList.get(i).setCost(cost);
        update = true;

      }
    }
    if (update == true) {
      System.out.println("book updated sucessfully");
    } else {
      System.out.println("book not found");
    }
  }

  public static searchBooks() throws BookNotFoundException
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the author name");
      String author=sc.nextLine();
      boolean search=false;
      for(Book book : bookList){
        if(book.getAuthor==author)
        {
          System.out.println(book);
          search=true;
        }
      }
      if(search!=true)
      {
        throw new BookNotFoundException("no books of this author is available");
      }
    }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int ch = 0;
    do {
      System.out.println("1.add books\n2.calculate cost\3.remove book\n4.updatebook\n5.search book\n6.exit");
      ch = sc.nextInt();
      switch (ch) {
        case 1:
          addBooks();
          break;

        case 2:
          calculateCost();
          break;

        case 3:
          removeBooks();
          break;

        case 4:
          updateBooks();
          break;

        case 5:
          searchBooks();
          break;

        case 6:
          break;

        default:
          System.out.println("invalid choice");
      }
    } while (ch != 6);
  }

}