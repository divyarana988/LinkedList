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

    public static ListNode mergeSort(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        if(head.next == null){
            return new ListNode(head.val);
        }
        
        ListNode mid = midNode(head);
        ListNode fwd = mid.next;
        mid.next = null;
        
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(fwd);
        
        mid.next = fwd;
        
        return mergeTwoLists(left, right);
    }