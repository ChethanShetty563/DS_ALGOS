package Java.Trees;

public class sizeOfBinTree {
    	public static int getSize(Node root)
	{
//add Code here.
            if(root == null) {
                return 0;
            }
            
            return 1 + getSize(root.left) + getSize(root.right);
    }
    
}
