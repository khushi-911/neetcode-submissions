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
    public void reorderList(ListNode head) {
        // two pointer for find middle
        // reverse from middle + 1
        // merge them 

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode pre = null;

        while(second != null){
            ListNode coming = second.next;
            second.next = pre;

            pre = second;
            second = coming;
        }

        second = pre;
        ListNode first = head;

        while(second != null){
            ListNode f1 = first.next;
            ListNode f2 = second.next;

            first.next = second;
            second.next = f1;

            first = f1;
            second = f2;
        }
    }
}
