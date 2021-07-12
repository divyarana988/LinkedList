  public static ListNode removeNthFromEnd(ListNode head, int n) {
    
    if(head==null || head.next==null){
        return null;
    }
    ListNode start = new ListNode(-1);
    ListNode fast = head, slow = head;
    
    for(int i=1; i<=n; i++){
        fast = fast.next;
    }
    if(fast==null){
        return head.next;
    }
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    return head;
  }