import java.util.*;
public class concat{
  public static void main(String args[]){
    int arr1[] = {1,2,3};
    int arr2[] = {4,5,6};
    int arr3[] = new int[arr1.length+arr2.length];
    
    int j = 0;
    for(int i=0;i<arr1.length;i++){
      arr3[j++] = arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
      arr3[j++] = arr2[i];
    }

    System.out.print("First array: ");
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i] + " ");
    }
    System.out.print("\nSecond array: ");
    for(int i=0;i<arr2.length;i++){
      System.out.print(arr2[i] + " ");
    }
    System.out.print("\nConcated array: ");
    for(int i=0;i<arr3.length;i++){
      System.out.print(arr3[i] + " ");
    }
  }
}