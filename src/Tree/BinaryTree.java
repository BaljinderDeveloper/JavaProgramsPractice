package Tree;

public class BinaryTree {

    Node root;
    public void insert(int data) {
//        if(root == null)
//            root = new Node(data);
//        else if (data < root.data) {
//            new Node(data);
//        } else if (data > root.data) {
//            new Node(data);
//        }
        root = insertrec(root, data);
    }
    public Node insertrec(Node root, int data){
        if(root == null)
            root = new Node(data);
        else if (data < root.data) {
            root.left = insertrec(root.left, data);
        } else if (data > root.data) {
            root.right = insertrec(root.right, data);
        }
        return  root;
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
    public void preOrder(){
        preOrderRec(root);
    }
    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    public void postOrder(){
        postOrderRec(root);
    }
    public void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }
}