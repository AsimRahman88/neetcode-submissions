class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }

            map.put(nums[i], map.get(nums[i]) + 1);
        }

        int[] output = new int[k];

        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxFreq = 0;

            for (Integer key : map.keySet()) {

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }

            output[i] = maxKey;

            // remove so next max can be found
            map.remove(maxKey);
        }

        return output;
    }
}
