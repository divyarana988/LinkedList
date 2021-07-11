public static ListNode copyRandomList(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        HashMap<ListNode, ListNode> map = new HashMap<>();
        map.put(null, null);
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = head, prev = dummy;
        
        while(curr != null){
            ListNode node = new ListNode(curr.val);
            prev.next = node;
            map.put(curr, node);
            prev = prev.next;
            curr = curr.next;
        }
        
        ListNode onode = head;
        ListNode cnode = dummy.next;
        
        while(onode != null){
            cnode.random = map.get(onode.random);
            cnode = cnode.next;
            onode = onode.next;
        }
        
        return dummy.next;
    }
