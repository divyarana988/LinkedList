public static int middle(){
    Node s = head, f= head;

    while(f!=tail && f.next!=tail){
        f = f.next.next;
        s = s.next;
    }
    return s.data;
}