public static ListNode segregate012(ListNode head) {
        
        ListNode done = new ListNode(-1);
        ListNode dzero = new ListNode(-1);
        ListNode dtwo = new ListNode(-1);
        
        ListNode p0 = dzero, p1 = done, p2 = dtwo, curr = head;
        
        while(curr != null){
            if(curr.val == 1){
                p1.next = curr;
                p1 = p1.next;
            }
            else if(curr.val == 0){
                p0.next = curr;
                p0 = p0.next;
            }
            else{
                p2.next = curr;
                p2 = p2.next;
            }
            curr = curr.next;
        }
        p1.next = dtwo.next;
        p0.next = done.next;
        
        p2.next = null;
        
        return dzero.next;
    }