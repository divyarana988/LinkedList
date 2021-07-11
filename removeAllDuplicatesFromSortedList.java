public static ListNode removeDuplicates(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy, curr= head.next;
        prev.next = head;
        
        while(curr != null){
           
            boolean flag = false;
            while(curr != null && prev.next.val == curr.val){
                curr = curr.next;
                flag = true;
            }
            if(flag){
                prev.next = curr;
            }else{
                prev = prev.next;
            }
            if(curr != null){
                curr = curr.next;
            }
        }
        
        
        return dummy.next;
    }