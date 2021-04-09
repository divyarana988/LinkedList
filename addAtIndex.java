void addAtIndex(int val, int idx){

   if(idx<0 || idx>size){
        System.out.println("Invalid arguments");
    }
    else if(idx==0){
        addFirst(val);
    }
    else if(idx==size){
        addLast(val);
    }else{
        Node node = new Node();
        node.data = val;
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        
        Node nb = temp.next;
        temp.next = node;
        node.next = nb;
        size++;
            }
      
      
    }
}