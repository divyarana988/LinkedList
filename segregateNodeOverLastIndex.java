public static ListNode segregateOnLastIndex(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = getTail(head);
        ListNode smaller = new ListNode(-1);
        ListNode larger = new ListNode(-1);
        ListNode ps = smaller, pl = larger, curr = head;
        
        while(curr != null){
            if(curr.val <= tail.val){
                ps.next = curr;
                ps = ps.next;
            }else{
                pl.next = curr;
                pl = pl.next;
            }
            curr = curr.next;
        }
        ps.next = larger.next;
        pl.next = null;
        return ps;
    }