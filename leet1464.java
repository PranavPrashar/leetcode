//1464. Maximum Product of Two Elements in an Array
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int value = 0;
        if (nums.length > 0) {
            value = (nums[nums.length - 2] - 1) * (nums[nums.length - 1] - 1);
        } else {
            value = 0;
        }

        return value;

    }
}
