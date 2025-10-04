package ICP1.Day_07_04_October;

public class Q01_LC_198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(House_robber(nums,0));

    }
    public static int House_robber(int nums[],int i){
        if(i >= nums.length){
            return 0;
        }

        int rob = nums[i] + House_robber(nums, i+2);
        int n_rob = House_robber(nums, i+1);

        return Math.max(rob,n_rob);
    }
}
