package ICP1.Day_07_04_October;

public class Q02_LC_53_MaximumSubarray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        
        System.out.println(maxSub(nums));
    }
    public static int maxSub(int nums[]){
        int sum=0;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            ans = Math.max(ans,sum);
            if(sum < 0){
                sum =0;
            }
        }
        return ans;
    }
}
