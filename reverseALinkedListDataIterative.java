public void reverseDI(){
    int p1=0, p2= size-1;

    while(p1<p2){
        Node n1 = getNode(p1);
        Node n2 = getNode(p2);

        int tempData = n1.data;
        n1.data = n2.data;
        n2.data = tempData;
        p1++;
        p2--;
    }
}

Node getNode(int idx){
    if(size==0){
        System.out.print("list is empty");
        return null;
    }else if(idx<0 || idx>=size){
        System.out.println("invalid input");
        return null;
    }else{
        Node temp = head;
        while(idx>0){
            temp = temp.next;
            idx--;
        }
        return temp;
    }
}