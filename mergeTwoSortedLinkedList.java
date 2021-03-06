public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        ListNode res = new ListNode(-1);
        ListNode tail = res;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        if(l1 != null){
            tail.next = l1;
        }else{
            tail.next = l2;
        }
        
        return res.next;
    }
