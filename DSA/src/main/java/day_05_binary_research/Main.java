package day_05_binary_research;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 25, 31, 46, 50, 57, 72};
        System.out.println(binarySearch(a, 12));
        System.out.println(binarySearchCvRecursion(a, 12, 0, 10));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1; // 4

        while (left <= right) { // left = right -> mảng con chỉ chứa duy nhất 1 phần tử //1
            int mid = (left + right) / 2;  //3
            if (arr[mid] == target) { //2
                return mid;
            }
            if (arr[mid] < target) {
                // range: mid + 1 -> right

                left = mid + 1;
            } else {
                // range: left -> mid -1
                right = mid - 1;
            }
        }
        // left > right
        // -> số lần duyệt tối đa sẽ là log2(n) ví dụ 5 = log2(32) -> 5 lần
        return -1;
    }


    // cách làm thứ 2 theo phương pháp đệ quy
    public static int binarySearchCvRecursion(int[] arr, int target, int left, int right) {
        // dieu kien dung
        if (left > right) {
            return -1;
        }
        // bai toan con, công thức quy nạp
        // Xét những mảng con bên trái hoặc bên phải để tìm target
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearchCvRecursion(arr, target, mid + 1, right);
        } else {
            return binarySearchCvRecursion(arr, target, left, mid - 1);
        }

    }

    //////////////////

}
