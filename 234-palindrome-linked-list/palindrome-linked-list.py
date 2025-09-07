# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        slow=head
        fast=head
        while fast is not None and fast.next is not None:
            slow=slow.next
            fast=fast.next.next
        firsthalf=head    
        newhead=self.reverseList(slow)
        while newhead is not None:
            if(firsthalf.val != newhead.val):
                return False
            firsthalf=firsthalf.next
            newhead=newhead.next
        return True

    def reverseList(self, head):
        prev = None
        current = head
        while (current is not None):
            nextNode = current.next
            current.next = prev
            prev = current
            current = nextNode
        
        return prev

         
        