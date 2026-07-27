import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int[] temp = new int[nums2.length];
        int k = 0;
        
        Arrays.sort(nums2);
        for (int i = 0; i < nums2.length; i++) {
            if (i > 0 && nums2[i] == nums2[i - 1]) continue; // Skip duplicates in nums2
            if (Arrays.binarySearch(nums1, nums2[i]) >= 0) {
                temp[k++] = nums2[i];
            }
        }
        return Arrays.copyOf(temp, k);
    }
}
