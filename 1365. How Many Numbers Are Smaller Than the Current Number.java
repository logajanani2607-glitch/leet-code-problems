class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        for (int n : nums) count[n + 1]++;
        for (int i = 1; i < 102; i++) count[i] += count[i - 1];
        
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) res[i] = count[nums[i]];
        return res;
    }
}
