public class DoubleList {

    int size;
    Node2 head;
    Node2 tail;


    public void addToHead(int val){
        // create node that will be added ass head
        Node2 node = new Node2(val);
        // if there is nothing in the list yet handle that case
        if(size == 0){
            this.head = node;
            this.tail = node;
        }else {
            // if there list already has size than other
            // things have to be done
            //set the next prop on the new head to the old head
            node.next = head;
            //set the prev on the previous head to new node
            head.prev = node;
            // set the  head to the new node
            this.head = node;

        }
        //size gets increased regardless
        size++;
    }

    public void addToTail(int val){
        //create the new Node
        Node2 node = new Node2(val);
        if(size == 0){
            this.head = node;
            this.tail = node;

        }else{
            // new node prev points to old tail
            node.prev = tail;
            //set previous tail.next to new node
            tail.next = node;
            // set new node to tail
            this.tail = node;
        }
        size++;
    }

    public void insertNode(int idx, int value){
        if(idx == 0){
            this.addToHead(value);
        }else if(idx == size - 1){
            this.addToTail(value);
        }else{
            Node2 newNode = new Node2(value);
            Node2 currentNode = head;
            for(int i = 0; i < idx - 1; i++){
                currentNode = currentNode.next;
            }
            currentNode.next.prev = newNode;
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;
            size++;
        }
    }

    public void print(){
        Node2 currentNode = this.head;
        while(currentNode != null){
            System.out.print(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
