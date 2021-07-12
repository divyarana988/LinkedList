    public static ListNode getTail(ListNode head){
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    
    public static ListNode IntersectionNodeInTwoLL(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode tail = getTail(headB);
        
        
        tail.next = headB;
        ListNode node = cycleNode(headA);
        tail.next = null;
        
        return node;
    }