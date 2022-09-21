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
    public ListNode reverseList(ListNode head) {
      ListNode resHead = new ListNode(-1, null),temp1 = head;
        while(temp1 != null){
            ListNode tba = new ListNode(temp1.val,resHead.next);
            resHead.next = tba;
            temp1 = temp1.next;
        }
        return resHead.next;
    }
}