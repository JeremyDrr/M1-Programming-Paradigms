import java.util.Stack;

public class BinaryTreeGeneric<T extends Comparable<T>> {
    NodeGeneric<T> root;

    //Add a value to the BinaryTree
    public void add(T val){

        NodeGeneric<T> node = new NodeGeneric<T>(val);

        if (root == null) {
            root = node;
        } else {

            NodeGeneric<T> prev = null;
            NodeGeneric<T> temp = root;

            while(temp != null) {
                prev = temp;
                if(val.compareTo(temp.val) > 0) {
                    temp = temp.right;
                }else{
                    temp = temp.left;
                }
            }
            if (val.compareTo(prev.val) < 0) {
                prev.left = node;
            } else {
                prev.right = node;
            }

        }
    }

    //Print the path
    public void inOrder() {
        NodeGeneric<T> tmp = root;
        Stack<NodeGeneric<T>> stack = new Stack<>();
        while(tmp!=null || !stack.isEmpty()){
            if(tmp!=null){
                stack.add(tmp);
                tmp = tmp.left;
            }else{
                tmp=stack.pop();
                System.out.print(tmp.val + " ");
                tmp = tmp.right;
            }
        }
    }
}