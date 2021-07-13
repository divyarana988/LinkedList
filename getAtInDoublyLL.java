public int getAt(int index) {
        if(size==0){
            ListIsEmptyException();
            return -1;
        }
        if(indexIsInvalidException(index, 0, size-1)){
            return -1;
        }
        Node temp = head;
        while(index-->0){
            temp = temp.next;
        }
        return temp.data;
    }
