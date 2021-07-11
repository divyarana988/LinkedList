public static ListNode segregate01(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode i = head, j = head;
        while(i!=null){
            if(i.val == 1){
                i = i.next;
            }else{
                int temp = i.val;
                i.val = j.val;
                j.val = temp;
                
                i = i.next;
                j = j.next;
            }
        }
        return head;
    }