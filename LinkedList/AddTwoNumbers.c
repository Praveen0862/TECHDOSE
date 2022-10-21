/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int carry = 0,sum;
    struct ListNode* head = NULL,*tail = NULL;
    while (l1 != NULL || l2 != NULL)
    {
        sum = carry;
        if (l1)
        {
            sum += l1->val;
            l1 = l1->next;
        }
        if (l2)
        {
            sum += l2->val;
            l2 = l2->next;
        }
        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = sum%10;
        node->next = NULL;
        carry = sum / 10;
        if (head == NULL)
        {
            head = tail = node;
        }
        else
        {
            tail->next = node;
            tail = node;
        }
    }
    if (carry > 0)
    {
        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = carry;
        node->next = NULL;
        tail->next = node;
    }
    return head;
}
