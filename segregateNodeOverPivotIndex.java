  public static ListNode segregate(ListNode head, int pivotIdx) {
    if(head == null || head.next == null){
        return head;
    }
    int idx = 0, data = 0;
    ListNode curr = head;
    while(curr!=null){
        if(idx == pivotIdx){
            data = curr.val;
        }
        idx++;
        curr = curr.next;
    }
    ListNode smaller = new ListNode(-1);
    ListNode larger = new ListNode(-1);
    ListNode pivot = null, sp = smaller, lp = larger;
    idx = 0;
    curr = head;
    while(curr != null){
        if(idx == pivotIdx){
            pivot = curr;
        }
        else if(curr.val<=data){
            sp.next = curr;
            sp = sp.next;
        }
        else{
            lp.next = curr;
            lp = lp.next;
        }
        curr = curr.next;
        idx++;
    }
    sp.next = pivot;
    pivot.next = larger.next;
    lp.next = null;
    sp = sp.next;
    return smaller.next;
  }