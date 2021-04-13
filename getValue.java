public int getFirst(){
    if(size==0){
        System.out.print("list is empty");
        return -1;
    }else{
        return head.data;
    }
}

public int getLast(){
    if(size==0){
        System.out.println("list is empty");
        return -1;
    }else{
        retrun tail.data;
    }
}

public int getValueAtIdx(){
    if(size==0){
        System.out.print("list is empty");
        return 0;
    }else if(idx<0 || idx>=size){
        System.out.println("invalid arguments");
        return -1;
    }else{
        Node temp = head;
        while(idx>0){
            temp = temp.next;
            idx--;
        }
        return temp.data;
    }
}