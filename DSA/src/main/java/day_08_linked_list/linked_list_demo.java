package day_08_linked_list;

public class linked_list_demo {
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);


        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        printList(n0);
        System.out.println();


//        insert(n0,4,10);
//        printList(n0);
//        System.out.println();

//        System.out.println("After insert at head linked list");
//        insertAtHead(n0,9);


        // how to find the element with index 4
//        System.out.println("val of element with index 4 is: ");
//        System.out.println(searchElement(10,n0));

        // Kiem tra lai truong hop head = null
//        insertAtTail(n0,100);
//        printList(n0);

        deleteAt(n0,3);
        printList(n0);
    }

    private  static void deleteAt(Node head, int index){
//        Node privious = searchElement(index -1,head);
//        Node nextNode = searchElement(index + 1,head);
//        privious.next = nextNode;


        // cach 2
        if (index == 0){
            head.next = head;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index -1){
                current.next = current.next.next;
                break;
            }
            count++;
            current = current.next;
        }

    }


    // insert a element to linked list
    private static void insert(Node head, int index,int valOfNewNode){
        // find node of privious of index node
        // link the privious node to new node
        // link new node to nextNode of privious

        Node privious = searchElement(index -1,head);
        Node nextNode = searchElement(index,head);

        Node newNode = new Node(valOfNewNode);

        newNode.next=nextNode;
        privious.next=newNode;
    }

    // insert at tail linked list
    private static void insertAtTail(Node head,int val) {
        Node newNode = new Node(val);
        if (head == null){
            newNode = head;
        }

        Node current = head;
        while (current.next != null){
            current=current.next;
        }
        current.next = newNode;
    }

    // thêm vào đầu linked list
    // làm lại cách 2 return về cái đầu mới, tạo 1 node trên main và chạy lại hàm in với head bằng node mới.
    private static void insertAtHead(Node head,int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        printList(head);
    }
    private static void printList(Node head){
        Node current = head; // current trỏ đến node đang được xét -> current reference to the head of list
        while (current != null){
            System.out.print(current.val + " -> ");
            // process current note complete


            // chuyển sang node tiếp theo ->  move to next node
            current = current.next;
        }
    }
    // find element with index by linked list
    private static Node searchElement(int index, Node head){
        Node current = head;
        int count = 0;
        while(current != null){
            if (count == index){
                return current;
            }
            current = current.next;
            count++;
        }
        return null;
    }
    static  class Node{
        public int val;
        public Node next;

        Node(int val){
            this.val = val;
        }
    }
}

