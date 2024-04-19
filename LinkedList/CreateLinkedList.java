package LinkedList;

public class CreateLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        CreateLinkedList cl=new CreateLinkedList();
        cl.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(6);

       cl.head.next=second;
        second.next=third;
        third.next=fourth;
       
int count=0;
        ListNode current=cl.head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            count++;
            current=current.next;

        }
       
        System.out.println("null");

        System.out.println("Linked List has ELements  :"+count);
    }

    private static class ListNode{
        private int data;
        private ListNode next;

    

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
    }

}

