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
        ListNode slow=head,fast=head,temp,prev;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        prev=null;
        while(slow!=null)
        {
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        slow=head;
        fast=prev;


         /*ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }*/
        
        while(fast.next!=null)
        {
           ListNode next=slow.next;
           ListNode fat=fast.next;
            
            slow.next=fast;
            fast.next=next;

            slow=next;
            fast=fat;
        }

    }
}