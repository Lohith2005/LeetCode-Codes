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
        while(curr!=null){
            sk.add(curr.val);
            li.add(curr.val);
            curr=curr.next;
        }
        for(int i=0;i<li.size();i++){
            int t=sk.pop();
            System.out.println(t+" ");
            if(t!=li.get(i)){   
                return false;
            }
        }
        return true;
    }
}