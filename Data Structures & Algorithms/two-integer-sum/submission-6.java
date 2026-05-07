class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;

        while (i < nums.length) {

            for (int j = 0; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

            i++;
        }

        return new int[]{};
    }
}