public class LL {
    public static class Node{
 
        // the main draw back of linked list is  it takes memory for both data and address
        //  but the values can be stored any where bcz they all are connected
        // but insertion can be done easily 
        // but traversing take O(n) time  but good thing is time complexity
        // where we can insert element without moving all elements unlike arrays
        // another limitation(singly linked list) is if we are given a node we can find only next elements but we cannot find before elements 
        // but we can solve that limitation using doublely linked list
        int data;  // value 
        Node next; // address of next node
        public Node(int data){
        this.data= data;
        this.next= null; // tail
    }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
         Node newNode= new Node(data);
        if(head==null){
            head=tail= newNode;
            return;
        }
       
        newNode.next= head;
        head=newNode;
    }

    public static void main(String[] args) {
        Node a= new Node(5);//head Node
        Node b= new Node(6);
        Node c= new Node(8);
        Node d= new Node(10);
        Node e= new Node(15);
       // before linking nodes 
        // 5  6  8  10  15

        // linking the nodes
        a.next=b; 
        // 5 -> 6  8  10  15  after linking a to b 
        b.next=c;
         // 5 -> 6 ->  8  10  15
        c.next=d;
         // 5 -> 6 -> 8 -> 10  15
        d.next=e;
         // 5 -> 6 -> 8 -> 10 -> 15
        e.next=null; // last node points to null
         // the resultant linked list looks like 
        // 5 -> 6 -> 8 -> 10 -> 15 -> null
        // checking the link of node by checking adresses
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.next);
        // System.out.println(c);
        // System.out.println(b.next);
        // System.out.println(d );
        // System.out.println(c.next);
        // System.out.println(e);
        // System.out.println(d.next);
        // System.out.println(e.next);
        //printing the values first to last
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data); 
        // printing values using .(dot) operator
        // System.out.println(a.data); //a
        // System.out.println(a.next.data);//b
        // System.out.println(a.next.next.data);//c
        // System.out.println(a.next.next.next.data);//d
        // System.out.println(a.next.next.next.next.data); //d

        Node temp=a;
      
        for(int i=0; i<5; i++){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
