/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode *head,*tail;
    head = tail = NULL;
    while (list1 != NULL && list2 != NULL)
    {
        struct ListNode *ptr = (struct ListNode*) malloc(sizeof(struct ListNode));
        if (list1->val < list2->val)
        {
            ptr->val = list1->val;
            list1 = list1->next;
        }
        else
        {
            ptr->val = list2->val;
            list2 = list2->next;
        }
        ptr->next = NULL;
        if (head == NULL)
        {
            head = tail = ptr;
        }
        else
        {
            tail->next = ptr;
            tail = ptr;
        }
    }
    if (list2 != NULL)
    {
        if (head == NULL)
        {
            head = list2;
        }
        else
        {
            tail->next = list2;
        }
    }
    else if (list1 != NULL)
    {
        if (head == NULL)
        {
            head = list1;
        }
        else
        {
            tail->next = list1;
        }
    }
    return head;
}
