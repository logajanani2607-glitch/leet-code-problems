class Solution {
    public int thirdMax(int[] nums) {
        Long m1 = null, m2 = null, m3 = null;
        
        for (int n : nums) {
            long x = n;
            if ((m1 != null && x == m1) || (m2 != null && x == m2) || (m3 != null && x == m3)) continue;
            
            if (m1 == null || x > m1) {
                m3 = m2; m2 = m1; m1 = x;
            } else if (m2 == null || x > m2) {
                m3 = m2; m2 = x;
            } else if (m3 == null || x > m3) {
                m3 = x;
            }
        }
        
        return m3 == null ? m1.intValue() : m3.intValue();
    }
}
