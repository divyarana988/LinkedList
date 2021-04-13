public static int kth(int k){
    Node s = head, f= head;
    while(k>0){
        f = f.next;
        k--;
    }
    while(f!=tail){
        f = f.next;
        s=s.next;
    }
    return s.data;
}