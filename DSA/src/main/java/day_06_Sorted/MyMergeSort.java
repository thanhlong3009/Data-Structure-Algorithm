package day_06_Sorted;

import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        // 1 mảng 1 phần tử chắc chắn được sắp xếp
//        int[] a1 = {1, 3, 5, 7};
//        int[] a2 = {2,4,6};
//        for (int i : merge2Arr(a1, a2)) {
//            System.out.println(i);
//        }

        int[] arr = {1,5,3,2,8,7,6,4};
        System.out.println(Arrays.toString(mergeSort(arr,0,7)));
    }

    // Merge 2 mảng đã sắp xếp
    public static int[] merge2Arr(int[] a1, int[] a2) {
        int b1 = a1.length;
        int b2 = a2.length;
        int[] res = new int[b1+ b2];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < b1 && j < b2) {
            if (a1[i] < a2[j]) {
                res[index] = a1[i];
                i++;
            }else {
                res[index] = a2[j];
                j++;
            }
            index++;
        }

        while (i<b1){
            res[index] = a1[i];
            index++;
            i++;
        }

        while (j < b2) {
            res[index] = a2[j];
            index++;
            j++;
        }
        return res;
    }

    // Chia để trị
    public static int[] mergeSort(int[] arr, int left, int right) {
        // Mảng có 1 phần tử chắc chắn là mảng đã được sắp xếp -> sorted
        // Lấy ra mảng có 1 phần tử

        System.out.println("Chia đôi mảng từ " + left + " đến " + right);

        if (left == right) {
            return new int[] {arr[left]};
        }

        int mid = left + (right - left) / 2;
        int[] a1 = mergeSort(arr,left,mid);
        int[] a2 = mergeSort(arr,mid + 1, right);

        int[] res = merge2Arr(a1,a2);

        System.out.println("Done merge từ " + left + " đến " + right);
        System.out.println(Arrays.toString(res));
        return res;
    }
}
