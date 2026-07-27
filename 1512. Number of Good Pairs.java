class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans = 0;
        for (int n : nums) {
            ans += count[n]++;
        }
        return ans;
    }
}
