
public static int findIndex(Linkedlist one, Linkedlist two){
    Node p1 = one.head;
    Node p2 = two.head;

    if(one.size()>two.size()){
        int diff = one.size() - two.size();
        while(diff>0){
            p1 = p1.next;
            diff--;
        }
    }else{
        int diff = two.size()- one.size();
        while(diff>0){
            p2 = p2.next;
            diff--;
        }
    }

    while(p1!=p2){
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1.data;
}