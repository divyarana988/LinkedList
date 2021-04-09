public void removeAtIndex(){

     if(idx<0 || idx>size){
        System.out.println("Invalid arguments");
    }
    else if(idx==0){
        removeFirst();
    }
    else if(idx==size-1){
        removeLast();
    }else{
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        Node nb = temp.next;
        Node mnb = nb.next;
        nb.next = null;
        temp.next = mnb;
        size--;
    }
}