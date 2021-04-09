void addLast(int val){
    Node node = new Node();
    node.data = val;

    if(size==0){
        head=tail=node;
        size++;
    }else{
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        tail = node;
        size++;
    }
}