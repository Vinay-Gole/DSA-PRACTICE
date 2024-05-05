package LinkedList;

public class SinglyLinkedList {

private ListNode head;


    public static void main(String[] args) {
        SinglyLinkedList sl= new SinglyLinkedList();

        sl.head= new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
       

        
       sl.head.next=second;
       second.next=third;
       sl.insertAtBeggining(40);
       sl.inserAtEnd(50);
       sl.insertAtPosition(1, 70);
    //    sl.deleteFromPosition(2);
       sl.deleteFromPosition(3);
    //    sl.deleteFromPosition(5);
    //    sl.deleteFirstNode();
    //    sl.deleteFromLast();

       sl.printLinkedList();

    }

    private static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }

    public void insertAtBeggining(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void inserAtEnd(int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            head=newNode;
            return ;
        }
        ListNode current=head;
        while (null!=current.next) {
            current=current.next;

            
        }

        current.next=newNode;
        
    }
    

    public void insertAtPosition(int pos,int val){

        ListNode node= new ListNode(val);


        if(pos==1){
            node.next=head;
            head=node;

        }
        else{
            ListNode prev=head;
            int count=1;
            while(count<pos-1){
            prev=prev.next;
            count++;
            }
            ListNode current=prev.next;
            prev.next=node;
            node.next=current;
        }
    }


    public ListNode deleteFirstNode(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    public ListNode  deleteFromLast(){
        if(head==null || head.next==null){
            return head;
        }

        ListNode current=head;
        ListNode previous=null;
        while (current.next!=null) {
            previous=current;
            current=current.next;
            
        }
        previous.next=null;
        return current;
    }

    public void deleteFromPosition(int pos){
        if(pos==1){
            head=head.next;
            return;
        }
        ListNode previous=head;
        int count=1;
        while(count<pos-1){ 
          previous=previous.next;
            count++;
        }
        ListNode current=previous.next;
        previous.next=current.next;
    }
    public void printLinkedList(){
    
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.data+" -> ");
            current=current.next;
            
        }
        System.out.print("null");
    }

}


