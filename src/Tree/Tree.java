package Tree;

public class Tree {

    class Node {
        int val;
        Node left;
        Node right;
        Node(int value){
            this.val = value;
        }
    }

    Node root;

    public Tree(int [] values){
        root = null;
        for (int value : values) {
            insert(value);
        }
    }


    public Node insert(int data){
        if(this.root == null){
            this.root = new Node(data);
            return this.root;
        }
        return insertHelper(this.root, data);
    }

    private Node insertHelper(Node parent, int  val){
        if(val <= parent.val){
            if(parent.left == null){
                System.out.println("inserting left " + val);
                return parent.left = new Node(val);
            }
            System.out.println("setting parent to left " + parent.left.val);
            return insertHelper(parent.left, val);
        }else{
            if(parent.right == null){
                System.out.println("Inserting right " + val);
                return parent.right = new Node(val);
            }
            System.out.println("setting parent to right " + parent.right.val);
            return insertHelper(parent.right, val);
        }
    }

    public Node find(int val){
        Node target = findNode(root, val);
        System.out.println("target " + (target == null ? "not found" : target.val));
        return target;
    }

    private Node findNode(Node currentNode, int val){
        if(currentNode == null) return null;
        if(currentNode.val == val) return currentNode;
        if(val < currentNode.val){
           return findNode(currentNode.left, val);
        }else{
            return findNode(currentNode.right, val);
        }

    }

    public void printInOrder(Node currentNode){
        if(currentNode == null) return;
        printInOrder(currentNode.left);
        System.out.println(currentNode.val + " ");
        printInOrder(currentNode.right);
    }

    // Pre order: root, left, right
    public void printPreOrder(Node currentNode) {
        if (currentNode == null) return;
        System.out.println(currentNode.val + " ");
        printPreOrder(currentNode.left);
        printPreOrder(currentNode.right);
    }

    // Post order: left, right, root
    public void printPostOrder(Node currentNode) {
        if (currentNode == null) return;
        printPostOrder(currentNode.left);
        printPostOrder(currentNode.right);
        System.out.println(currentNode.val + " ");
    }

}
