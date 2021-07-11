public static ListNode segregate012(ListNode head) {
        ListNode i= head, j=head, k=head;
        
        while(i != null){
            if(i.val == 2){
                i = i.next;
            }
            else if(i.val == 1){
                int temp = i.val;
                i.val = k.val;
                k.val  = temp;
                
                i = i.next;
                k = k.next;
            }else{
                int temp = i.val;
                i.val = j.val;
                j.val  = temp;
                
                if(i.val == 1){
                    int tempk = i.val;
                    i.val = k.val;
                    k.val  = tempk;
                }
                i = i.next;
                j = j.next;
                k = k.next;
            }
        }
        
        return head;
    }