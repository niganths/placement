
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
class Main {
    public static void main(String[] args) {
        Node head = addfirst(10);
        addlast(12, head);
        addlast(13, head);
        addlast(14, head);
        addlast(15, head);
        search(16,head);
        specific(11,1,head);
        printLinkedList(head);
    }

    static Node addfirst(int data) {
        Node newnode = new Node(data);
        return newnode;
    }

    static Node addlast(int data, Node head) {
        Node lastdata = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lastdata;
        lastdata.next = null;
        return lastdata;
    }
    static Node specific(int data,int pos,Node head)
    {
        Node atpos=new Node(data);
        Node temp = head;
         for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
    }
        atpos.next=temp.next;
        temp.next=atpos;
        return atpos;
        
        
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        int count=0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.println("the length is "+count); 
    }
    static void search(int data,Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
           if(temp.data==data)
           {
              System.out.print("yes");
              return;
           }
            temp=temp.next;
        }
        System.out.println("not fount");
        
       
    }
}
