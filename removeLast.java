public void removeLast(){

    if(size==0){
        System.out.println("List is empty");
    }
    
    else {
        Node temp = head;
         if(size==1){
        head=tail=null;
        size--;
        }
        else {
            while(temp.next!=tail){
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
            size--;
        }
}