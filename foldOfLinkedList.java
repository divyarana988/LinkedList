
    public static ListNode midNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head, slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            ListNode nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        return prev;
    }

    public static void fold(ListNode head) {
        if(head == null || head.next==null){
            return ;
        }
        ListNode mid = midNode(head);
        ListNode nhead = mid.next;
        
        mid.next = null;
        
        nhead = reverse(nhead);
        
        ListNode p1 = head;
        ListNode p2 = nhead;
        ListNode tp1 = null;
        ListNode tp2 = null;
        
        while(p2!=null){
            tp1 = p1.next;
            tp2 = p2.next;
            
            p1.next = p2;
            p2.next = tp1;
            
            p1 = tp1;
            p2 = tp2;
        }
    }