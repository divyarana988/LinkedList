public void oddEven(){
    LinkdedList odd = new LinkdedList();
    LinkdedList even = new LinkdedList();

    while(this.size()>0){
        int val = this.getFirst();
        this.removeFirst();
        
        if(val %2 == 0){
            even.addLast(val);
        }else{
            odd.addLast(val);
        }
    }

    if(even.size()!=0 && odd.size()!=0){
        odd.tail.next = even.head;
        this.head = odd.head;
        this.tail = even.tail;
        this.size = even.size + odd.size;
    } else if(even.size()!=0 ){
        this.head = even.head;
        this.tail = even.tail;
        this.size = even.size ;
    }
    else if(odd.size()!=0 ){
        this.head = odd.head;
        this.tail = odd.tail;
        this.size = odd.size ;
    }
}