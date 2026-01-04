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
    public ListNode reverse(ListNode head)
    {
        ListNode net=head;
        ListNode curr=head;
        ListNode prev=null;

        while(curr.next!=null)
        {
            net=curr.next;
            curr.next=prev;
            prev=curr;
            curr=net;
        }
        curr.next=prev;
        head=curr;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=reverse(head);
        ListNode temp=head;
        ListNode travel_temp=head;
        int i=1;
        while(i!=n)
        {
            travel_temp=temp;
            temp=temp.next;
            i++;
        }

        if(n==1 && head.next==null)
        {
            return null;
        }
        else if(n==1 && head.next!=null) head=head.next;
        else   travel_temp.next=temp.next;
        head=reverse(head);
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
        return head;

    }
}