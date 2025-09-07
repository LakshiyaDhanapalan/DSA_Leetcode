/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    
    struct ListNode* temp1 = head;
    
        if( head == NULL)
        {
            return NULL;
        }
        while(temp1!=NULL && temp1->next!=NULL )
        {
            
            if(temp1->val == temp1->next->val)
            {
                temp1->next=temp1->next->next;   
            }
            else{
            temp1=temp1->next;
            }
            
            
        }
        return head;
}