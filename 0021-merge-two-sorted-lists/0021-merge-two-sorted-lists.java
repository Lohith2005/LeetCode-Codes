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
    public void sortList(ListNode head){
        ListNode currNode=head;

        while(currNode.next!=null){
            if(currNode.val>currNode.next.val){
                int temp=currNode.val;
                currNode.val=currNode.next.val;
                currNode.next.val=temp;
            }
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currNode=list1;
        ListNode head2=list2;
        while(currNode!=null){
            currNode=currNode.next;
        }
        currNode.next=head2;
        sortList(list1);
        return list1;
    }
}