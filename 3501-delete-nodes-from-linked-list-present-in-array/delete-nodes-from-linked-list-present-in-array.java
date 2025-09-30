class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

       
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode temp = head;

        while (temp != null) {
            if (set.contains(temp.val)) {
               
                temp = temp.next;
            } else {
               
                prev.next = temp;
                prev = temp;
                temp = temp.next;
            }
        }
        prev.next = null;
        return dummy.next;
    }
}
