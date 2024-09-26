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
        ListNode dummynode=new ListNode(-1);
        ListNode current=dummynode;
       
         int carry=0;
        while(l1!=null || l2!=null){
           int sum=carry;
           if(l1!=null) {sum+=l1.val;}
           if(l2!=null) {sum+=l2.val;}

          
           carry=sum/10;
           if(l1!=null) l1=l1.next;
           if(l2!=null) l2=l2.next;

            current.next = new ListNode(sum % 10);
        current = current.next;

        }

        if(carry>0)
        {
           current.next = new ListNode(carry);
         
        }

        return dummynode.next;

    }
}