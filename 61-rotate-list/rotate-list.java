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

        while(q!= null){
            count++;
            q = q.next;
        }
        int rotation = k % count;

        for(int j = 1; j <= rotation ; j++){
            ListNode p = head;
            for(int i = 1 ; i < count-1; i++){
                p = p.next;
            }
            ListNode temp = p.next;
            p.next = null;
            temp.next = head;
            head = temp;
        }
        return head;
    }
}