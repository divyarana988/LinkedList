public static boolean isCyclePresentInLL(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }