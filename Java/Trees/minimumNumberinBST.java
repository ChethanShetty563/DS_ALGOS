package Java.Trees;

import java.util.ArrayList;

public class minimumNumberinBST {

    static int minimumElemetInBST(Node root) {

        if(root == null) {
            return -1;
        }

        if(root.left != null) {
            return minimumElemetInBST(root.left);
        }

        return root.data;
    }
    public static void main(String[] args) {

        Node node = new Node(5);
        node.left = new Node(4);
        node.left.left = new Node(3);
        node.left.left.left = new Node(1);
        node.right = new Node(6);
        node.right.right = new Node(7);
        System.out.println(minimumElemetInBST(node)); 


        
    }
    
}
