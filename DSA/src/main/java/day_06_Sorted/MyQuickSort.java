package day_06_Sorted;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        // pivot = 9;
        // chia lam 2 phần
        // low < 9
        // high > 9
        int[] arr = {1,7,5,2,4,9,8,6};
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
        int left = low + 1, right = high;
        int pivot = arr[low];

        while (true) {
            // Tìm tuần tự phía bên trái mà  > pivot
            while (left <= right && arr[left] < pivot) {
                left++;
            }// tìm được arr[left] > pivot

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
        swap(arr, low, right);
        System.out.println(Arrays.toString(arr));
        return right;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
