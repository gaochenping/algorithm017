package leetcodePlugin;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

// 思路：
// 1、暴力求解
// 2、排序后夹逼
class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]),i};
            }
            map.put(nums[i], i);
        }

        return null;



        // if (nums==null || nums.length<2) {
        //     return null;
        // }

        // int[] result = new int[2];
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i+1; j< nums.length; j++) {
        //         if (nums[i] + nums[j] == target ) {
        //             result[0] = i;
        //             result[j] = j;
        //             return result;
        //         }
        //     }
        // }
        // return result;
    }
}
// @lc code=end

