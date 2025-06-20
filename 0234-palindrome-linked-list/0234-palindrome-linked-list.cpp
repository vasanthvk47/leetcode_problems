class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if (!head || !head->next) return true;

        // Step 1: Find the middle (slow will point to mid)
        ListNode *slow = head, *fast = head;
        while (fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        // Step 2: Reverse the second half of the list
        ListNode* prev = nullptr;
        while (slow) {
            ListNode* next_node = slow->next;
            slow->next = prev;
            prev = slow;
            slow = next_node;
        }

        // Step 3: Compare both halves
        ListNode* left = head;
        ListNode* right = prev; // reversed second half
        while (right) {
            if (left->val != right->val) return false;
            left = left->next;
            right = right->next;
        }

        return true;
    }
};
