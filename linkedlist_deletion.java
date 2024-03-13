class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
class ListInsertion{
    public static void main(String [] args)
    {
        Node head= addfirst(3);
        addlast(4,head);
        addlast(5,head);
        addlast(7,head);
        addlast(8,head);
        specific(6,head,4);
        addlast(10,head);
        specific(9,head,7);
        search(7,head);
        head=deletefirst(head);
        deletelast(head);
        deleteatsecific(head,5);
        printing(head);
    }
    static Node addfirst(int data){
        Node newnode=new Node(data);
        return newnode;
    }
    static Node addlast(int data,Node head)
    {
        Node last=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=last;
        last.next=null;
        return last;
    }
    static Node specific(int data,Node head,int pos)
    {
        Node atpos=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        atpos.next=temp.next;
        temp.next=atpos;
        return atpos;
    }
    static void printing(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
    static void search(int data,Node head)
    {
        Node mover=head;
        while (mover!=null)
        {
            if(mover.data==data)
            {
                System.out.println("found");
                return;
            }
            mover=mover.next;

        }
        System.out.println("not found");
    }
    static Node deletefirst(Node head)
    {

        head=head.next;
        return head;
    }
    static  Node deletelast(Node head)
    {
        Node temp=head;
//        Node temp1;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }
    static  Node deleteatsecific(Node head,int pos)
    {
        Node temp=head;
        Node temp1;
        for (int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        temp1=temp.next;
        temp.next=temp1.next;
        return head;

    }
}
