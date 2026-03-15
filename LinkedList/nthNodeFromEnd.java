public class nthNodeFromEnd {

    
    public static Node nthNode(Node head, int n){
            int size=0;
            Node temp=head;
            while (temp!=null) {
                size++;
                temp=temp.next;   
            }
            temp=head;
            for(int i=1; i<size-n+1; i++){
                 temp=temp.next;
            }
            return temp;

    }

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
            f.next=g;
            g.next=h;
            //5 10 15 20 30 24 50 90
            Node q=nthNode(a,4);
            System.out.println(q.data);
            

    }
}