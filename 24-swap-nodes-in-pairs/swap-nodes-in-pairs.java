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
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if(head.next==null)return head;
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            ListNode first = temp;
            ListNode second = temp.next;
            ListNode nextPair = second.next;   // SAVE next pair BEFORE modifying links
            newHead.next = second;    // connect previous part to second
            second.next = first;      // second -> first
            first.next = nextPair;    // first -> start of next pair (or null)
            // move forward
            newHead = first;
            temp = nextPair; 
        }
        return dummy.next;

    }
}