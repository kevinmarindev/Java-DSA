public class CircularLinkedList {

    public int size;
    public Node head;
    public Node tail;

    public void print(){

    }

    public void addNodeToHead(int val){
        Node newNode = new Node(val);
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
            newNode.next =  newNode;
        }

        //increase the size
    }
}
