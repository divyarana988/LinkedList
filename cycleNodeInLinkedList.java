public static ListNode CycleNode(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                break;
            }
        }
        
        if(slow!=fast){
            return null;
        }
        
        fast = head;
        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }