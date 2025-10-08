package ICP1.Day_09_07_October;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Q03_LC_143_ReorderList {
     public void reorderList(ListNode head) {
        List<Integer> ll = new ArrayList<>();
        List<Integer> nl = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int ri = ll.size()-1;
        int ind=0;
        for(int i=0;i<ll.size();i++){
            if(i%2!=0){
                nl.add(i,ll.get(ri));
                ri--;
            }
            else{
                nl.add(ll.get(ind++));
            }
        }
        temp = head;
        ind=0;

        while(temp != null){
            temp.val = nl.get(ind++);
            temp = temp.next;
        }
        
    }
}
