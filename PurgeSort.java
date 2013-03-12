import java.util.ArrayList;

public class PurgeSort {
  
  public static void purgeSort(ArrayList<Integer> arr) {
    for (int i=0; i<arr.size()-1; i++) for (int j=0; j<arr.size()-1; j++) {
      if (arr.get(j) > arr.get(j+1))
        arr.remove(j);
    }
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    
    array.add(1);
    array.add(2);
    array.add(3);
    array.add(5);
    array.add(4);
    
    System.out.println("Unsorted array:");
    
    for (Integer i : array) {
      System.out.print(i + " ");
    }
    
    purgeSort(array);
    
    System.out.print("\n\n");
    
    System.out.println("Sorted array:");
    
    for (Integer i : array) {
      System.out.print(i + " ");
    }
  }

}
