import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};    
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = {1, 2, 3, 43, 67, 34, 23, 2, 5, 1, 1, 1, 35, 5, 2, 5};
    Sort.insertionSort(arr3);
    System.out.println(Arrays.toString(arr3));

    int[] arr4 = {3, 5, 2, 1, 0, 34};
    Sort.insertionSort(arr4);
    System.out.println(Arrays.toString(arr4));

    int[] arr5 = {1, 2, 3, 4};
    Sort.insertionSort(arr5);
    System.out.println(Arrays.toString(arr5));
  }
}
