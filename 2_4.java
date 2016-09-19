import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode beforeBg = null, beforeEd = null,
                afterBg = null,afterEd = null;
        while(pHead != null)
        {
            ListNode next = pHead.next;
            pHead.next = null;
            if(pHead.val <x)
            {
                if(beforeBg == null)
                {
                    beforeBg = pHead;
                    beforeEd = pHead;
                }
                else
                {
                    beforeEd.next = pHead;
                    beforeEd = pHead;
                }
            }
            else
            {
                if(afterBg == null)
                {
                    afterBg = pHead;
                    afterEd = pHead;
                }
                else
                {
                    afterEd.next = pHead;
                    afterEd = pHead;
                }
            }
            pHead = next;
        }
        
        if(beforeBg == null) return afterBg;
        beforeEd.next = afterBg;
        return beforeBg;
    }
}
