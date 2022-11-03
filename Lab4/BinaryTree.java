import java.util.Stack;

public class BinaryTree {
    Node root;

    //Add a value to the BinaryTree
    public void add(int val) {

        Node node = new Node(val);

        if(root == null){
            root = node;
            return;
        }

        Node prev = null;
        Node temp = root;

        while(temp!=null){
            if(temp.val>val){
                prev = temp;
                temp = temp.left;
            }else if(temp.val<val){
                prev = temp;
                temp=temp.right;
            }
        }
        if(prev.val>val){
            prev.left=node;
        }else{
            prev.right=node;
        }
    }

    //Print the path
    public void inOrder() {
        Node tmp = root;
        Stack<Node> stack = new Stack<>();
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