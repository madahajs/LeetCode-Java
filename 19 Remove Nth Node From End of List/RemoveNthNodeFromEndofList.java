/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode q = head;
        ListNode p = head;
        for(int i=0;i<n;i++){
            q=q.next;
        }
        if(q==null){
            head=head.next;
            p=null;
            return head;
        }
        while(q.next!=null){
            q=q.next;
            p=p.next;
        }
        ListNode temp = p.next.next;
        p.next = temp;
        return head;
    }
}