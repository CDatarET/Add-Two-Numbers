# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        c1 = l1
        c2 = l2
        prev = ListNode(0, c1)
        carry = 0

        while(c1 != None and c2 != None):
            c1. val = c1.val + c2.val + carry
            carry = 0
            if(c1.val >= 10):
                c1.val = c1.val % 10
                carry = 1

            c1 = c1.next
            c2 = c2.next
            prev = prev.next     

        if(c1 == None):
            prev.next = c2
            c1 = c2
            while(carry == 1 and c1 != None):
                c1.val = c1.val + carry
                carry = 0
                if(c1.val >= 10):
                    c1.val = c1.val % 10
                    carry = 1

                c1 = c1.next
                prev = prev.next

            if(c1 == None and carry == 1):
                t = ListNode(1, None)
                prev.next = t

        if(c2 == None):
            while(carry == 1 and c1 != None):
                c1.val = c1.val + carry
                carry = 0
                if(c1.val >= 10):
                    c1.val = c1.val % 10
                    carry = 1

                c1 = c1.next
                prev = prev.next

            if(c1 == None and carry == 1):
                t = ListNode(1, None)
                prev.next = t

        return(l1)
