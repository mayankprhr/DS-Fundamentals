public class BinaryTrees {

//class having left and right child of node
static class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }

	
}
    //defining root of the tree
    Node root;

    //constructor when data is inserted
    BinaryTrees(int data)
    {
        root=new Node(data);
    }
    //constructor when starting a tree
    BinaryTrees()
    {
        root=null;
    }

    public void treeInsert(int value){
        if (root==null)
        {
            root.data=value;
        }
        else if (value<=root.data)
        {
            if(root.left==null)
            {
                root.left=new Node(value);
            }
            else{
                treeInsert(root.left.data=value);
            }
        }
        else {
            if(root.right==null){
                root.right=new Node(value); 
            }
            else{
                treeInsert(root.right.data=value);
            }
        }
    }

    public void printInorder(Node node){
        
        if(root==null){
            System.out.println("nothing to do here");
            return;
        }
            if(node==null){
            return;
        }

        printInorder(node.left);

        System.out.print(node.data+" ");

        printInorder(node.right);
    }    




    public static void main(String[] args) {

        BinaryTrees bt=new BinaryTrees();
        
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);

        bt.printInorder(bt.root);

    }
}
