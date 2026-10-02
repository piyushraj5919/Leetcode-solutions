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
    public boolean isPalindrome(ListNode head) {

        int count = 0;
        ListNode p = head;
        while(p != null){
            count++;
            p = p.next;
        }

        int arr[] = new int[count];
        ListNode q = head;
        int iteration = 0;

        while(q != null){
            arr[iteration] = q.val;
            iteration++;
            q = q.next;
        }

        int i = 0;
        int r = arr.length-1;

        while(i < r){
            if(arr[i] != arr[r]){
                return false;
            }
            i++;
            r--;
        }
        return true;
        
    }
}