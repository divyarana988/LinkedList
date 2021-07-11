 public static ListNode segregateEvenOdd(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyE = new ListNode(-1);
        ListNode dummyO = new ListNode(-1);
        ListNode otail = dummyO;
        ListNode etail = dummyE;
        ListNode curr = head;
        
        while(curr != null){
            if(curr.val%2 != 0){
                otail.next = curr;
                otail = otail.next;
            }
            else{
                etail.next = curr;
                etail = etail.next;
            }
            curr = curr.next;
        }
        etail.next = dummyO.next;
        otail.next = null;
        return dummyE.next;
    }