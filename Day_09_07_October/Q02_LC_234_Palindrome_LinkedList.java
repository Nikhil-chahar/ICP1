package ICP1.Day_09_07_October;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Q02_LC_234_Palindrome_LinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int nums[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        int st=0, end = nums.length-1;
        while(st<end){
            if(nums[st] != nums[end]){
                return false;
            }
            st++;
            end--;
        }

        return true;
    }
    
}