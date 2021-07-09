import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        if(h1==null || h2==null){
            return (h1==null) ? h2: h1;
        }
        
        h1 = reverse(h1);
        h2 = reverse(h2);
       
        ListNode res = new ListNode(-1);
        
        ListNode p1 = h1;
        ListNode p2 = h2;
        ListNode p3 = res;
        int carry =0;
        
        while(carry!=0 || p1!=null || p2!=null){
            int v1 = (p1==null) ? 0 : p1.val;
             int v2 = (p2==null) ? 0 : p2.val;
             
            int sum = v1+v2+carry;
            carry = sum/10;
            sum = sum%10;
            
            ListNode node = new ListNode(sum);
            p3.next = node;
            
            p3 = p3.next;
            p1 = (p1==null) ? null : p1.next;
            p2 = (p2==null) ? null : p2.next;
        }
        
        ListNode temp = res;
        res = res.next;
        temp.next = null;
        
        h1 = reverse(h1);
        h2 = reverse(h2);
        res = reverse(res);
        
        return res;
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

    // InFput_code===================================================

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode makeList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = makeList(scn.nextInt());
        ListNode head2 = makeList(scn.nextInt());

        ListNode ans = addTwoNumbers(head1, head2);
        printList(ans);
    }

}