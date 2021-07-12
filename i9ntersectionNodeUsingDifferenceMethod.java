public static int length(ListNode node){
        int len =0;
        while(node != null){
            node = node.next;
            len++;
        }
        return len;
    }


    public static ListNode IntersectionNodeInTwoLL(ListNode headA, ListNode headB) {
        
        
        int l1 = length(headA), l2 = length(headB);
        
        ListNode big = l1>l2 ? headA : headB;
        ListNode small = l1>l2 ? headB : headA;
        
        int diff = Math.max(l1, l2) - Math.min(l1, l2);
        
        while(diff>0){
            big = big.next;
            diff--;
        }
        
        while(big!=small){
            big = big.next;
            small = small.next;
        }
        
        return big;
    }