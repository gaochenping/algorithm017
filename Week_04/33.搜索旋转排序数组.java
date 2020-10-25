/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        // 1024
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;

            // 分成左右两部分，只有三种情况向左边归约：
            // 1.nums[0]<nums[mid] && nums[0]<= target <=nums[mid]
            //    左边不包含转折点且target在nums[0]和nums[mid]之间
            // 2.nums[0]>nums[mid] &&  target <= nums[mid]
            //    左边包含转折点且target在转折点和nums[mid]之间
            // 3.nums[0]>nums[mid] && target >=nums[0]
            //    左边包含转折点且target在nums[0]和转折点之间

            if (
                (nums[0] < nums[mid] && nums[0] <= target && target <= nums[mid])
                ||
                (nums[0] > nums[mid] && (target <= nums[mid] || target >= nums[0]))
            ) {// 向左边归约
                right = mid - 1;
            } else { // 向右边归约
                left = left + 1;
            }
        }
        return -1;


    }
}
// @lc code=end

