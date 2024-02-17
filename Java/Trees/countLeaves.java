package Java.Trees;

public class countLeaves {
    int countLeaves(Node root) 
    {
         // Your code  
         if(root == null) {
             return 0;
         }
         if(root.left == null && root.right == null) {
             return 1;
         }
         
         return countLeaves(root.left) + countLeaves(root.right);    
    }   
}
