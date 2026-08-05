class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        boolean[] present = new boolean[max + 1];
        for (int num : nums) {
            present[num] = true;
        }
        for (int i = min; i <= max; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}