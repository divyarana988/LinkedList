int size(){
    return list.size();
}

void add(int val){
    list.addLast(val);
}

int remove(){
    if(size==0){
        System.out.print("Queue is underflow");
        return -1;
    }else{
        list.removeFirst();
    }
}

int peek(){
    if(size==0){
        System.out.print("Queue is underflow");
        return -1;
    }else{
        list.getFirst();
    }
}