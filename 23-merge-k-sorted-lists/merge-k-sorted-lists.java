class  Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        List<Integer> al = new ArrayList<>();
        
        for (ListNode list : lists) {
            ListNode current = list;
            while (current != null) {
                al.add(current.val);
                current = current.next; 
            }
        }
        
        Collections.sort(al);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int value : al) {
            current.next = new ListNode(value);
            current = current.next;
        }
        
        return dummy.next;
    }
}
