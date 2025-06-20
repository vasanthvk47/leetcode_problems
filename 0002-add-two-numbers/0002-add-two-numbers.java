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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode temp=l1,t1=l1,t2=l2;
        while(l1!=null && l2 !=null)
        {
            int s=l1.val+l2.val+c;
            l1.val=s%10;
            if(s>9) c=1;
            else c=0;
            l1=l1.next;
            l2=l2.next;
           
        }

        if(l1==null)
        {
            while(temp.next!=null) temp=temp.next;
            temp.next=l2;
            if(c==1)
            {
                while(l2!=null){
                int s=l2.val+c;
                l2.val=s%10;
                 if(s>9) c=1;
                else c=0;
                if(c==1 && l2.next==null)
                {
                    ListNode ne= new ListNode(1);
                    ne.next=null;
                    l2.next=ne;
                    return t1;
                    

                }else
                l2=l2.next;
                }
            }
           

        }
        if(l2==null)
        {

            if(c==1)
            {
                while(l1!=null){
                int s=l1.val+c;
                l1.val=s%10;
                 if(s>9) c=1;
                else c=0;
                if(c==1 && l1.next==null)
                {
                    ListNode ne= new ListNode(1);
                    ne.next=null;
                    l1.next=ne;
                    return t1;
                    

                }else
                l1=l1.next;
                }
            }
           

        }
        if(l1==null && l2==null && c==1)
        {
            while(temp.next!=null) temp=temp.next;
            ListNode ne= new ListNode(1);
                    ne.next=null;
                    temp.next=ne;
                    return t1;
        }
        return t1;
    }
}