public static ListNode segregate01(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode done = new ListNode(-1);
        ListNode dzero = new ListNode(-1);
        ListNode p0 = dzero, p1 = done, curr = head;
        
        while(curr != null){
            if(curr.val == 1){
                p1.next = curr;
                curr = curr.next;
                p1 = p1.next;
            }else{
                p0.next = curr;
                curr = curr.next;
                p0 = p0.next;
            }
        }
        p0.next = done.next;
        p1.next = null;
        head = dzero.next;
        
        return head;
    }
