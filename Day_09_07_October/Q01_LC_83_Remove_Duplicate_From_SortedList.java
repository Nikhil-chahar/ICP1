package ICP1.Day_09_07_October;


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Q01_LC_83_Remove_Duplicate_From_SortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode nt = head.next;

        while(nt != null){
            if(curr.val == nt.val){
                curr.next = nt.next;
                nt= nt.next;
            }else{
                curr = curr.next;
                nt = nt.next;
            }
        }
        return head; 
    }
}
