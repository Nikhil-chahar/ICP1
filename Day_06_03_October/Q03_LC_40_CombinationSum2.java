package ICP1.Day_06_03_October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_LC_40_CombinationSum2 {
    public static void main(String[] args) {
        int candidates[] = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(candidates, int target);

    }
    public static List<List<Integer>> combinationSum2(int[] can, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(can);

        combination(can,0,tar,ll,ans);
        return ans;
    }
    public static void combination(int arr[],int st, int tar,List<Integer> ll,List<List<Integer>> ans){
        if(tar == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=st;i<arr.length;i++){
            if(i > st && arr[i] == arr[i-1]) continue; 
            if(arr[i] >tar) break;
            
            ll.add(arr[i]);
            combination(arr,i+1,tar-arr[i],ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}