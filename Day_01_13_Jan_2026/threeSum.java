package ICP1.Day_01_13_Jan_2026;
import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,2,3,4,5};
        List<List<Integer>> ans = three_3Sum(nums);
        System.out.println(ans);

    }
    public static List<List<Integer>> three_3Sum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i < n-2){
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if(nums[i] > 0) return ans;

            int j =i+1,k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    while(j < k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
}
