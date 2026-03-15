public class nthNodeFromEnd {

    public static class Node{  // defining nodes
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {  

        //Creating a nodes
            Node a= new Node(5);
            Node b= new Node(10);
            Node c= new Node(15);
            Node d= new Node(20);
            Node e= new Node(30);
            Node f= new Node(34);
            Node g= new Node(50);
            Node h= new Node(90);
            // linking Nodes 
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            f.next=f;
            g.next=h;
            

    }
}