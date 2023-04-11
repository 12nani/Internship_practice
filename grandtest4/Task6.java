import java.util.*;

public class Task6
  {
    public static void main(String args[]){
      int array1[]={10,20,30,40,50,60};
      int dest1=50;
      System.out.println("nearest element:"+nearEle(array1,dest1));

      int array2[]={70,80,90,100,120,130};
      int dest2=90;
      System.out.println("nearest element:"+nearEle(array2,dest2));   
    }

    public static int nearEle(int array[],int dest){
      if(array.length==0)
      {
        return -1
      }
      int left=0;
      int right=0;

      while(left<=right){
        int mid=left+(right - left)/2;
        if(array[mid]==dest){
          return array[mid]; 
        }
        else{
          right = mid-1;
        }
      }
      if(right<0){
        return(array[left]);
      }
      if(left>array.length-1){
        return array[right];
      }
      }
    }
  }