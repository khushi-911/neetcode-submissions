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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer = head;
        int length = 0;
        while(pointer != null){
            length++;
            pointer = pointer.next;
        }

        int previous = length - n;

        if(previous == 0) return head.next;

        pointer = head;
        for(int i = 1; i < previous; i++){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;

        return head;
    }
}
