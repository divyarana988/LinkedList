static ListNode th = null;
    static ListNode tt = null;
    
    public static void addFirstNode(ListNode node){
        if(th == null){
            th = node;
            tt= node;
        }else{
            node.next = th;
            th = node;
        }
    }
    
    public static int Length(ListNode node){
        ListNode curr = node;
        int len=0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
    
    public static ListNode reverseInKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode oh = null, ot = null;
        int len = Length(head);
        ListNode curr = head;
        
        while(len>=k){
            int tempk = k;
            while(tempk-->0){
                ListNode fwd = curr.next;
                curr.next = null;
                addFirstNode(curr);
                curr = fwd;
            }
            if(oh==null){
                oh = th;
                ot = tt;
            }else{
                ot.next = th;
                ot = tt;
            }
            th = null;
            tt = null;
            len-=k;
        }
        ot.next = curr;
        return oh;
    }