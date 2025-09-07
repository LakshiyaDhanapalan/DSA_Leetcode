/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */





struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* current = head;
    while (current != NULL) {
        struct ListNode* nextNode = current->next;
        current->next = prev;
        prev = current;
        current = nextNode;
    }
    return prev;
}


bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL)
        return true;

    struct ListNode* slow = head;
    struct ListNode* fast = head;

    
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

   
    struct ListNode* secondHalf = reverseList(slow);
    struct ListNode* firstHalf = head;

    while (secondHalf != NULL) {
        if (firstHalf->val != secondHalf->val) 
        return false;
        firstHalf = firstHalf->next;
        secondHalf = secondHalf->next;
    }

    return true;
}
