	public class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode l = new ListNode(0);
			ListNode cur = l;
			while (l1 != null || l2 != null) {
				int num = 0;
				if (l1 != null) {
					num += l1.val;
					l1 = l1.next;
				}
				if (l2 != null) {
					num += l2.val;
					l2 = l2.next;
				}
				num += cur.val;
				cur.val = num % 10;
				if (l1 != null || l2 != null || (num/10 != 0) ){
					cur.next = new ListNode(num/10);
					cur = cur.next;
				}
			}

			return l;

		}
	}

	/**
	 * Definition for singly-linked list.
	 */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}