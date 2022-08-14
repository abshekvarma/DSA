package Practice;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }

        public static Node insert(Node root, int data){
            if(root==null){
                root = new Node(data);
            }
            else if(data<root.data){
                root.left = insert(root.left, data);
            }else if(data>root.data){
                root.right = insert(root.right, data);
            }
            return root;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(""+root.data);
            inorder(root.right);
        }

        public static boolean search(Node root, int key){
            if(root == null){
                return false;
            }
            if (root.data == key) {
                return true;
            }else if(key<root.data){
                return search(root.left, key);
            }
            else {
                return search(root.right, key);
            }
        }

        public static void main(String[] args) {
            int[] arr = {1,5,2,6,4,9};
            int searchKey = 9;
            Node node = null;
            for(int i : arr){
                node = insert(node, i);
            }
            inorder(node);
            System.out.println();
            if(search(node,searchKey)){
                System.out.println("Key Found in BST");
            }else{
                System.out.println("Key Not Found in BST");
            }
        }
    }
}
