import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        getNums(result, new ArrayList<Integer>(), 1,  n, k);

        return result;
    }


    public void getNums(List<List<Integer>> result, List<Integer> list, int start, int n, int k) {

        if (k == 0) {
            result.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i);
            getNums(result, list, i+1, n, k-1);

            list.remove(list.size()-1);
        }

    }
}
// @lc code=end

