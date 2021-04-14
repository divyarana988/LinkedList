public void reversePR(){
    reverseHelper(head);

    head.next = null;
    Node temp = head;
    head = tail;
    tail = temp;
}

private void reverseHelper(Node node){
    if(node==null || node==tail){
        return ;
    }
    reverseHelper(node.next);
    node.next.next = node;
}