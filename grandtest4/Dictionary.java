// You have been tasked with creating a dictionary program in Java that stores words and their definitions using a hash map. The program should allow the user to add new words and definitions, view the definitions of existing words. Additionally, the program should handle exceptions when adding a word that already exists in the dictionary or trying to view the definition of a non-existent word.  

// Create a console-based menu-driven program that allows the user to perform the following operations: 

// 1. Add Word and its definition 

// 2. View Definition 

// 3. Number of Words 

// 4. Search Words 

// 5. Exit 

// Depending on the user's choice, prompt the user for the necessary inputs and call the appropriate methods to perform the required action. 

import java.util.HashMap;
import java.util.*;

public class Dictionary{
  public static void  addWords(HashMap<String, String> dictionary, Scanner sc){

    System.out.println("enter the word to add");
    String word=sc.nextLine();

    if(dictionary.containsKey(word)){
      System.out.println("word already present");
    }
    else{
      System.out.println("Enter defination");
      String def=sc.nextLine();
      dictionary.put(word, def);
    }
  }
  public static void numWords(HashMap<String, String> dictionary, Scanner sc){
    int size=dictionary.size();
    System.out.println("total words are"+size);
    
  }
  
  public static void viewDef(HashMap<String, String> dictionary, Scanner sc){
    System.out.println("enter word");
    String word=sc.nextLine();

    if(dictionary.containsKey(word)){
      String def=dictionary.get(word);
      System.out.println(def);
    }
    else{
      System.out.println("Word not found in dictionary");
    }
  }

  public static void searchWords(HashMap<String, String> dictionary, Scanner sc){
    System.out.println("enter the word");
    String word=sc.nextLine();

    for(String word: dictionary.keySet()){
      if(word.contains(word)){
        System.out.println(dictionary.get(word));
        
      }
    }
  }

  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    HashMap<String, String> dictionary = new HashMap<String,String>();
    int ch;

    do{
      System.out.println("1.Add new word\n2.view defination\n3.number of words\n4.search words\n5.exit");
      switch(ch){
        case 1: addWords();
          break;

        case 2: viewDef();
          break;

        case 3: numWords();
          break;

        case 4: searchWords();
          break;

        case 5: break;

        default: System.out.println("invaild choice");
          break;

      }
      
    }while(ch!=5);
  }
  
}