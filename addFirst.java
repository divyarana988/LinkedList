void addFirst(int val){
    Node node = new Node();
    node.data = val;

    if(size==0){
        head= tail= node;
        size++;
    }
    else{
        
        node.next = head;
        head = node;
        size++;
    }
}