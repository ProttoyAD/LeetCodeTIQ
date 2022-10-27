import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        Solution my=new Solution();
        int[] ok={3,2,4};
        System.out.println(Arrays.toString(my.twoSum(ok,6)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i=0; i<nums.length-1;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target) {
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
