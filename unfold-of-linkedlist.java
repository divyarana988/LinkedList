import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr= head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        return prev;
    }

    public static void unfold(ListNode head) {
        if(head==null || head.next==null|| head.next.next==null){
            return;
        }
        ListNode nhead = head.next;
        ListNode p1 = head;
        ListNode p2 = nhead;
        
        while(p2!=null && p2.next!=null){
            p1.next = p1.next.next;
            p2.next = p2.next.next;
            
            p1 = p1.next;
            p2 = p2.next;
        }
        nhead = reverse(nhead);
        p1.next = nhead;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}