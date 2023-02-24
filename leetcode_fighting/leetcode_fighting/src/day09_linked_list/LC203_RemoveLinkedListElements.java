package day09_linked_list;

public class LC203_RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode x=head;
        ListNode it=x;
        // Lọc các phần tử có val == val trong list
        while(x!=null && x.val==val){
            head=x.next;
            x=head;
        }
        while(x!=null){
            if(x.val==val){

                it.next=x.next;
                x=it.next;
            }
            else{
                it=x;
                x=x.next;
            }

        }

        return head;
    }
}
