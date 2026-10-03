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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }
        int count = 0;
        ListNode p = head;

        while(p != null){
            count++;
            p = p.next;
        }
        ListNode q = head;
        for(int i = 1 ; i < count/2; i++){
            q = q.next;
        }
        q.next = q.next.next;

        return head;
    }
}