package Classwork;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int s = 9;
        System.out.println( canSum(arr, s));
    }
    public static boolean canSum(int[] nums, int s) {
        if (s == 0) return true;
        if (nums == null || nums.length == 0) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum < s) return false;
        boolean[] dp = new boolean[s + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = s; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[s];
    }
}

