/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode prev = new ListNode(0, c1);
        int carry = 0;

        while(c1 != null && c2 != null){
            c1. val = c1.val + c2.val + carry;
            carry = 0;
            if(c1.val >= 10){
                c1.val = c1.val % 10;
                carry = 1;
            }
            c1 = c1.next;
            c2 = c2.next;
            prev = prev.next;
        }        

        if(c1 == null){
            prev.next = c2;
            c1 = c2;
            while(carry == 1 && c1 != null){
                c1.val = c1.val + carry;
                carry = 0;
                if(c1.val >= 10){
                    c1.val = c1.val % 10;
                    carry = 1;
                }
                c1 = c1.next;
                prev = prev.next;
            }

            if(c1 == null && carry == 1){
                ListNode t = new ListNode(1, null);
                prev.next = t;
            }
        }

        if(c2 == null){
            while(carry == 1 && c1 != null){
                c1.val = c1.val + carry;
                carry = 0;
                if(c1.val >= 10){
                    c1.val = c1.val % 10;
                    carry = 1;
                }
                c1 = c1.next;
                prev = prev.next;
            }

            if(c1 == null && carry == 1){
                ListNode t = new ListNode(1, null);
                prev.next = t;
            }
        }
        return(l1);
    }
}
