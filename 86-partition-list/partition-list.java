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

        ListNode p = head;
        ListNode less = null;
        ListNode lessTail = null;

        ListNode greater = null;
        ListNode greaterTail = null;

        while(p != null){
            ListNode temp = p.next;
            if(p.val < x){
                if(less == null){
                    less = p;
                    lessTail = p;
                }
                else{
                    lessTail.next = p;
                    lessTail = p;
                }
            }
            else{
                if(greater == null){
                    greater = p;
                    greaterTail = p;
                }
                else{
                    greaterTail.next = p;
                    greaterTail = p;
                }
            }
            p.next = null;
            p = temp;

        }
        if (less == null) {
            return greater;
        }
        lessTail.next = greater;
        return less;  
    }
}