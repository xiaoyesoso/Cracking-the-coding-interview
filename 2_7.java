public class Palindrome {
	public boolean isPalindrome(ListNode pHead) {
		// write code here
		Stack<Integer> stack = new Stack<Integer>();
		ListNode p = pHead;
		while (p != null) {
			stack.push(p.val);
			p = p.next;
		}

		p = pHead;

		while (!stack.empty()) {
			if (stack.pop() != p.val) {
				return false;
			}
			p = p.next;
		}
		return true;
	}
}
