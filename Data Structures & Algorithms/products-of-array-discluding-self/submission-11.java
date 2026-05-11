class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int before = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = before;
            before *= nums[i];
        }

        int after = 1;
        for (int i = (nums.length) - 1; i >= 0; i--) {
            output[i] *= after;
            after *= nums[i];
        }

        return output;
    }
}
