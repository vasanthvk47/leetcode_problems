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
        int c=0;
        ListNode temp=head,t1=null;
        while(temp!=null) {c++;temp=temp.next;}
        if(c==1) return null;
        temp=head;
        while(temp!=null )
        {
            if(c==n)
            {
                if(t1==null)
                {
                    head=temp.next;
            System.out.println(c+" "+n);
                    break;
                }
                else{
                t1.next=temp.next;
                break;}
            }
           c--;
           t1=temp;
            temp=temp.next;
        }
        return head;

    }
}