int size(){
    return list.size();
}

void push(int val){
    list.addFirst(val);
}

int pop(){
    if(size==0){
        System.out.print("stack is underflow");
        return -1;
    }else{
        return list.removeFirst();
    }
}

int top(){
    if(size==0){
        System.out.print("stack underflow");
        return -1;
    }else{
        return list.getFirst();
    }
}