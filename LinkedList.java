import java.util.*;

public class LinkedList {
    Node head;

    static class Node {             //Made inner class static so that i 
        int data;
        Node next;

        Node(int d)                 //Constructor
        {
            data=d;
            next=null;
        }
    } 

    public void DeleteKey(int key)
    {
        Node temp=head,prev=null;
        
        
        //If head only contains the key
        if(temp!=null && head.data==key)
        {
            head=head.next;
        }

        while(temp!=null && temp.data!=key)
        {   
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }


    public void printList(){
        
        ArrayList <Integer> al=new ArrayList<Integer>();
        Node n=head;
        while(n!=null)
        {
            al.add(n.data);
            //System.out.println();
            n=n.next;
        }
        
        //System.out.println(al.size());
        al.forEach(System.out::println);
    }

    public void push(int new_data){

        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void insert_after(Node prev_node,int new_data){
        //1.check if given previous node is null
        if(prev_node==null)
        {
            System.out.println("cannot be null");
            return;
        }
        //2.Allocate the node and put in the data
        Node new_node=new Node(new_data);

        //3.Make the new node's next element as previous node's next element
        new_node.next=prev_node.next;

        //4.Point the next of previous element to new node
        prev_node.next=new_node;
              
    }

    public void insert_afterData(int prev_nodeData, int new_data)
    {
        Node prev_node=new Node(prev_nodeData);
        Node new_node=new Node(new_data);
        prev_node=head;
        if (prev_node==null)
        {
            System.out.println("Nothing here");
            return;
        }

        while(prev_node.data!=prev_nodeData){
            prev_node=prev_node.next;
            }
            if (prev_node.data==prev_nodeData){
                new_node.next=prev_node.next;
                prev_node.next=new_node;
            }
    }

    public void calcSize(){
        //ArrayList<Integer> al=new ArrayList<Integer>();
        int count=0;
       // Map<Integer, Integer> mp=new Map();
        Node n=head;
        while(n!=null){
            count++;
            n=n.next;
        }

        System.out.println("Size : "+count);
    }

    void calcFrequency(){
    Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
    Node n=head;
    while(n!=null){
        //int count=0;
        
        if (mp.containsKey(n.data)){
        mp.put(n.data, mp.get(n.data)+1);
            }
        else{
            mp.put(n.data,1);
            }
        n=n.next;
        }

        for (Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    void swapNodes(int x, int y){
        if (x==y)
        return;

        //find position of X
        Node prevX=null, curX=head;
        while(curX!=null && curX.data!=x)
        {   
            prevX=curX;
            curX=curX.next;
        }
        
        //find position of y      
        Node prevY=null, curY=head;
        while(curY!=null && curY.data!=y)
        {   
            prevY=curY;
            curY=curY.next;
        } 

        if (curX==null || curY ==null)
        return;

        //
        if(prevX!=null)
            prevX.next=curY;
        else
            head=curY;

        if(prevY!=null)
            prevY.next=curX;
        else
            head=curX;


    Node temp=curX.next;
    curX.next=curY.next;
    curY.next=temp;
    }

    void Reverse()
    {
        Stack <Node> s=new Stack <Node>();
        Node temp=head;
        while (temp.next!=null){
            s.push(temp);
           temp=temp.next;
        }
        head=temp;
        while(!s.isEmpty()){
            temp.next=s.peek();
            s.pop();   
            temp=temp.next;
        }
        temp.next=null;

    }

    public static void main(String[] args) {
    
        // LinkedList l1=new LinkedList();
        // l1.head=new Node(1);
        // Node second=new Node (2);               //second-> data=2 next =null
        // Node third=new Node (3);                //third-> data=3 next =null
        // l1.head.next=second;
        // second.next=third;    
        // l1.push(6);
        // l1.push(7);
        // l1.insert_after(l1.head.next.next,55);
        // l1.printList();


        LinkedList l2=new LinkedList();
        l2.push(6);
        l2.push(5);
       // l2.push(4);
       // l2.push(3);
        l2.push(4);
        l2.push(3);
        l2.push(2);
        l2.push(1);
        //l2.insert_afterData(3, 10);
        System.out.println("Insert here");
       // l2.printList();
       // System.out.println();
        //System.out.println("Delete here");
        //l2.DeleteKey(5);
        //l2.printList();
        //l2.calcSize();
        //l2.calcFrequency();       
        //l2.swapNodes(5, 6);
        l2.printList();
    }
}
