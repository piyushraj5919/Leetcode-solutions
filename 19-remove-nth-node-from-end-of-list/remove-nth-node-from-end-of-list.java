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

       int count = 0;
       ListNode p = head;
       while(p != null){
        count++;
        p = p.next;
       } 
       int num = count - n;

       if(num == 0){
        return head.next;
       }
       ListNode temp = head;

       for(int i = 1 ; i < num ; i++){
        temp = temp.next;
       }
       temp.next = temp.next.next;

       return head;
    }
}