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
    public int pairSum(ListNode head) {
        //ListNode dummy=new ListNode(-1);
        //ListNode newHead=dummy;
        ListNode f1=head;
        ListNode h2=middle(head);
        ListNode f2=reverse(h2);
        int sum,max=0;
        while(f2!=null){
            sum=f1.val+f2.val;
            max=Math.max(max,sum);
            f1=f1.next;
            f2=f2.next;
        }
        return max;        
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}