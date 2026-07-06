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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode temp=head;
        int count=1;
      while(temp.next!=null){
        count++;
        temp=temp.next;
      }  
      k=k%count;
      temp.next=head;
      ListNode curr=head;
      for(int i=0;i<count-k-1;i++){
         curr=curr.next;
      }
      ListNode newHead=curr.next;
      curr.next=null;

      return newHead;
    }
}