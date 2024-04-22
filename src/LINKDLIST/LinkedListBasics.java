package LINKDLIST;

public class LinkedListBasics {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public static void addLast(int data) {
            ListNode newNode  = new ListNode(data);
            if(head == null){
                head = newNode;
                return;
            }
            ListNode currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;

        }

        public static  void print() {
            ListNode currNode  = head;
            if(head == null){
                System.out.println("This List is empty");
                return;
            }
            while(currNode != null){
                System.out.println("currNode---->"+currNode.data);
                currNode = currNode.next;
            }
        }
    }

    public  static ListNode head;
    public static void main(String[] args) {
        System.out.println("Hello LinkedList!!!");
        LinkedListBasics L = new LinkedListBasics();
        ListNode.addLast(1);
        ListNode.addLast(2);
        ListNode.addLast(3);
        ListNode.print();
    }


}
