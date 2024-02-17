package Java.Trees;
import java.util.ArrayList;


import Java.Trees.Node;

public class preOrderTraversal {

     static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> res = new ArrayList();
        recurPreorder(root, res);
        System.out.println(res);
        return res;

    }
    
    public static void recurPreorder(Node root, ArrayList<Integer> res) {
        if(root == null) {
            return;
        }
        res.add(root.data);
        recurPreorder(root.left, res);
        recurPreorder(root.right, res);
        
    }
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(4);
        node.left.left = new Node(3);
        node.left.left.left = new Node(1);
        node.right = new Node(6);
        node.right.right = new Node(7);
        preorder(node);


        
    }
}
