package ICP1.Day_10_22_October;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q08_LC_496_NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int n : nums2) {
            while (!st.isEmpty() && st.peek() < n)
                map.put(st.pop(), n);
            st.push(n);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
            res[i] = map.getOrDefault(nums1[i], -1);
        return res;
    }
}
