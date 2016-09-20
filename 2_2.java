public class Solution {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode pre = head;
		int cnt = k;
		while ((--cnt) != 0 && pre != null) {
			pre = pre.next;
		}
		if (pre == null) {
			return null;
		}

		ListNode dist = head;
		while (pre.next != null) {
			pre = pre.next;
			dist = dist.next;
		}
		return dist;
	}
}
