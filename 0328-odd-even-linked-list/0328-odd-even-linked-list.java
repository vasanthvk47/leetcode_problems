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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
       ListNode f=head,s=head.next,k=s;
       while(s!=null && s.next!=null)
       {
        f.next=s.next;
        f=f.next;
        s.next=f.next;
        s=s.next;
       } 
       f.next=k;
       return head;
    }
}