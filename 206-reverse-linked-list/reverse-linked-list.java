class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> st = new Stack<>();
        
        while (head != null) {
            st.push(head);
            head = head.next;
        }
        
        ListNode newHead = st.pop();
        ListNode curr = newHead;
        
        while (!st.isEmpty()) {
            curr.next = st.pop(); 
            curr = curr.next;    
        }

        curr.next = null; 
        
        return newHead;
    }
}