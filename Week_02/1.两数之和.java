package leetcodePlugin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start


class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        // 方法2：哈希表
        // 思路：遍历数组，把键值对：nums[i] <-> i 放入hashmap
        //      遍历过程中判断hashmap中是否包含键：(target-nums[i])
        //      包含的话就可以组成数组返回
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;

        
        // 方法1：暴力破解
        // int[] res = new int[2];
        // for (int i = 0; i < nums.length-1; ++i) {
        //     for (int j = i + 1; j < nums.length; ++j) {
        //         if (nums[i] + nums[j] == target) {
        //             res[0] = i;
        //             res[1] = j;
        //             return res;
        //         }
        //     }
        // }
        // return res;
        
    
    }
}
// @lc code=end

