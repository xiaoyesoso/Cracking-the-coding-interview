public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
    	ListNode pa = a;
    	ListNode pb = b;
    	while(pa != null && pb != null){
    		pa.val += pb.val;
    		if (pa.val >= 10){
    			if (pa.next == null){
    				pa.next = new ListNode(0);
    			}
    			
    			++pa.next.val;
    			pa.val -= 10;
    		}
    		pa = pa.next;
    		pb = pb.next;
    	}
    	
    	if(pa == null) pa = pb;
    	return a;
    }
}
