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
        Stack<Integer> sk=new Stack();
        List<Integer> li=new ArrayList<>();
        if(head==null||head.next==null)return true;
        ListNode curr=head;
        ListNode curr2=head;
        while(curr!=null){
            sk.add(curr.val);
            curr=curr.next;
        }
        while(curr2!=null){
            if(sk.pop()!=curr2.val){   
                return false;
            }
            curr2=curr2.next;
        }
        return true;
    }
}