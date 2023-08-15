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
    public ListNode partition(ListNode head, int x) {
      
        ListNode smallerNode = new ListNode(0);
        ListNode s=smallerNode; 
        ListNode greaterNode=new ListNode(0);
        ListNode g=greaterNode;
        ListNode curr= head;
        while(curr!=null){
            ListNode next = curr.next;
            if(curr.val <x){
                
                s.next = curr;
                s=s.next;
                
            }
            else{
                g.next = curr;
                g =g.next;
            }
            curr = next;
        }
        g.next =null;
        s.next = greaterNode.next;
        return smallerNode.next;
    }
}
