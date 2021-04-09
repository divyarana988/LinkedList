public void removeFirst(){
    if(size==0){
        System.out.println("List is empty");
    }
    if(size==1){
        head=tail=null;
        size--;
    }
    else {
        Node temp = head;
        temp=temp.next;
        head = temp;
        size--;
    }
        
}