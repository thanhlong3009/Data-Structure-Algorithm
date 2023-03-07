package exam;

public class LC160_IntersectionOfTwoLinkedLists {
    // vì phần sau node chung của 2 list là như nhau nên sự chênh lệch chỉ có thể xảy ra ở phần trước node chung
    // kiểm ra xem chênh lệch giữa 2 chuỗi là bao nhiêu và dịch chuyển node của list dài hơn lơn bấy nhiêu
    // khi đó chèều dài còn lại của 2 chuỗi sẽ bằng nhau
    // ta chỉ cần dùng vòng while và xét từng node

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA); //n
        int sizeB = getSize(headB); //m
        ListNode a = headA, b = headB;
        // dịch chuyển node của list dài hơn từ head
        for (int i = 1; i <= Math.abs(sizeA - sizeB); i++) { // n - m || m - n
            if (sizeA > sizeB){
                a = a.next;
            }else {
                b = b.next;
            }
        }
        // check node chung
        while (a != b && a != null && b != null){  // n || m
            a = a.next;
            b = b.next;
        }
        if (sizeA > sizeB){ // kiểm tra cho trường hợp trả về null
            return b;
        }else {
            return a;
        }
         // => O(n)
    }
    // lấy ra độ dài của 2 danh sách liên kết
    public static int getSize(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr!=null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
