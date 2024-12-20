/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();

        ListNode curr = head;
        
        while(curr!=null){
            if(map.containsKey(curr)){
               return true;
            } 
            map.put(curr,1);
            curr = curr.next;
            
        }
        
        return false;
        
    }
}