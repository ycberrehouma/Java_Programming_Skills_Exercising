import java.util.*;
class Node{
    int value;
    Node right;
    Node left;
    public Node(int data ){
        value=data;
         right=null;
         left=null;
    }

    public static class BST

    {

        Node root;
        boolean isBST()
        {
            return BSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        boolean BSTUtil(Node node,int min, int max){
            if (node==null){
                return true;
            }
            if(node.value>max || node.value<min){
                return false;
            }
            return BSTUtil(node.left,min,node.value-1) && BSTUtil(node.right,node.value+1,max);
        }
    }



    public static void main(String[] arg){
        BST tree=new BST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

    }

}