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

    public static ListNode midNode(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode fast= head;
        ListNode slow = head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle = midNode(head);
        ListNode nhead = middle.next;
        
        middle.next = null;
        nhead = reverse(nhead);
        ListNode p1 = head;
        ListNode p2 = nhead;
        boolean res = true;
        while(p2!=null){
            if(p1.val!=p2.val){
                res = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        nhead = reverse(nhead);
        middle.next = nhead;
        return res;
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

        System.out.println(isPalindrome(dummy.next));
    }
}