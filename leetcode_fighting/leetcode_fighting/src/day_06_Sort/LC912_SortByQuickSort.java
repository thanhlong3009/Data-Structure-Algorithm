package day_06_Sort;

import java.util.Arrays;

public class LC912_SortByQuickSort {
    public static void main(String[] args) {

        int[] arr = {1,4,2,3};
        System.out.println("Init: " + Arrays.toString(arr));
        quickSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high){

            int sortedItem = patition(arr,low,high); // Tìm được 1 phần tử sorted
            quickSort(arr,low,sortedItem - 1);
            quickSort(arr,sortedItem + 1,high);
        }
    }


    public static int patition(int[] arr, int low, int high) {
        System.out.println("patition from " + low + " to " + high);
        int left = low, right = high - 1;
        int pivot = arr[high];

        while (true) {
            while (left <= right && arr[left] < pivot) {
                left++;
            }

            while (left <= right && arr[right] > pivot) {
                right--;
            }
            if (left >= right) {
                break;
            }
            System.out.println("swap " + arr[left] + " to " + arr[right]);;
            swap(arr, left, right);
            System.out.println(Arrays.toString(arr));
            left++;
            right--;
        }
        System.out.println("pivot = " + pivot + " , right = " + right + " ,left = " + left + ". swap " + arr[low] +  " to  " + arr[right]);
        swap(arr, high, left);
        System.out.println(Arrays.toString(arr));
        return left;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
