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
        // if (head == null || head.next == null) {
        //     return head;
        // }

        // ListNode newHead = reverseList(head.next);

        // head.next.next = head;
        // head.next = null;

        // return newHead;
        ListNode temp=head;
        ArrayList<Integer> al = new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int i=al.size()-1;i>=0;i--){
            temp.val=al.get(i);
            temp=temp.next;
        }
        return head;
    }
}