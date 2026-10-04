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

        if(head == null || head.next == null){
            return head;
        }

        int count = 0;
        ListNode q = head;

        while(q != null){
            count++;
            q = q.next;
        }
        int rotation = k % count;
        if(rotation == 0){
            return head;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
    
        ListNode p = head;
        for(int i = 1; i < count-rotation; i++){
            p = p.next;
        }
        ListNode newhead = p.next;
        p.next = null;
        return newhead;
    }
}