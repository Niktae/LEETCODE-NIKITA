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
        int length= findLength(head);
        int transverseTill=length-n-1;
        if(transverseTill==-1){
             return head.next;
        }
        ListNode cur=head;
        /*while(i< transverseTill){
            cur=cur.next;
            i++;
        }*/
        for(int i=0;i<transverseTill;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    public int findLength(ListNode head){
        int cnt=0;
        if (head== null){
            return cnt;
        }
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}