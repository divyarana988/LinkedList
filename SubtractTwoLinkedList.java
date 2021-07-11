public static ListNode subtractTwoNumbers(ListNode h1, ListNode h2) {
        
        if(h1==null){
            h2.val = -h2.val;
            return h2;
        }
        if(h2==null){
            return h1;
        }
        h1 = reverse(h1);
        h2 = reverse(h2);
        
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        
        ListNode p1 = h1, p2 = h2;
        int borrow = 0;
        while(p1!=null){
            int diff = borrow + p1.val - (p2!=null ? p2.val : 0);
            
            if(diff<0){
                borrow = -1;
                diff += 10;
            }else{
                borrow = 0;
            }
            res.next = new ListNode(diff);
            res = res.next;
            
            p1 = p1.next;
            if(p2!=null){
                p2 = p2.next;
            }
        }
        return reverse(dummy.next);
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode forw = curr.next;

            curr.next = prev;

            prev = curr;
            curr = forw;
        }

        return prev;
    }