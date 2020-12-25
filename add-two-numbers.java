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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0); // This is just getting the head of the LinkedList 
        ListNode l3 = dummyhead;
        int l1_value, l2_value;
        int carry = 0;
        while(l1 != null && l2 != null ){// this will ensure that if one of them is null then we can really do anything and just can return one of the other
            
            l1_value = (l1 != null) ? l1_value:0; // this is saying that if the value of l1 is not null then we                                                             //should set the value of the l1_value to 0. 
             l2_value = (l2 != null) ?  l2_value:0;
            
            int current_value = l1_value + l2_value + carry;
            carry = current_value / 10;// if we have 10 then the carry will be 1 
            int last_digit = current_value %10; // this will give us just the last digit so if we do 4+6 =10
                                              // 10%10  = 0 
            
            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;
    
            if( l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            l3 = l3.next;
            
        }
        if(carry >0 ){
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        return dummyhead.next;
        
        
    }
}