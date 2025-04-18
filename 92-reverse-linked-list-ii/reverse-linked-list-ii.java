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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        //make mark for curr node and the node before reversing
        ListNode preleft=dummy;
        ListNode curr=head;
        for(int i=0;i<left-1;i++){
            preleft=preleft.next;  // preleft=previous left
            curr=curr.next; 
        }
        // make marker to node where we start reversing
        ListNode  sublisthead=curr;
        ListNode prev=null;
        for(int i=0;i<=right-left;i++){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        //join ll
        preleft.next=prev;
        sublisthead.next=curr;
        return dummy.next;
    }
}