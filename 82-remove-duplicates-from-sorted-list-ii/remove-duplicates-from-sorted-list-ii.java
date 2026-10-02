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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        while(head != null && head.next != null && head.val == head.next.val){
            int value = head.val;
            while(head != null && head.val == value){
                head = head.next;

            }
        }
        ListNode p = head;

        while(p != null && p.next != null){
            if(p.next.next != null && p.next.val == p.next.next.val){
                ListNode temp = p.next;

                while(temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                p.next = temp.next;
            }
            else{
                p = p.next;
            }
        }
        return head;
        
    }
}