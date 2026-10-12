class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final int MOD = 1_000_000_007;
        int[] count = new int[30];
        for (int num : nums) {
            for (int b = 0; b < 30; b++) {
                if (((num >> b) & 1) == 1) {
                    count[b]++;
                }
            }
        }
        long result = 0;
        while (k-- > 0) {
            long value = 0;
            for (int b = 29; b >= 0; b--) {
                if (count[b] > 0) {
                    value += (1L << b);
                    count[b]--;
                }
            }

            result = (result + value * value) % MOD;
        }

        return (int) result;
    }
}