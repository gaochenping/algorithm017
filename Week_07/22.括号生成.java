import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {


        List<String> list = new ArrayList<>();
        helper(list, "", 0, 0, n);
        return list;


    }
    
    // 1115
    public void helper(List<String> list, String str, int left, int right, int n){
        // recursion terminator
        if (str.length() == n*2) {
            list.add(str);
            return;
        }

        // drill down
        if (left < n) {
            helper(list, str + "(", left + 1, right, n);
        }

        if (right < left) {
            helper(list, str + ")", left, right + 1, n);
        }

    }


    // 1030
    // public void recurse(List<String> list, String str, int left, int right, int n) {

    //     // recursion terminator
    //     if (str.length() == n*2) {
    //         list.add(str);
    //         return ;
    //     }

    //     // drill down
    //     if (left < n) {
    //         recurse(list, str + "(", left + 1, right, n);
    //     }
    //     if (right < left) {
    //         recurse(list, str + ")", left, right +1 , n);
    //     }
        
    // }





    // 1017
    // public void recurse(List<String> list, String str, int left, int right, int n) {
    //     // recursion terminator
    //     if(str.length() == n*2) {
    //         list.add(str);
    //         return;
    //     }

    //     // process current logic
    //     // drill down
    //     if (left < n) {
    //         recurse(list, str + "(", left + 1, right, n);
    //     }
    //     if (right < left) {
    //         recurse(list, str + ")", left, right + 1, n);
    //     }

    //     // restore current status if need
    // }
    
    
    // 1016
    // public void backTrack(List<String> list, String str, int left, int right, int max){
    //     if (str.length() == max * 2) {
    //         list.add(str);
    //         return;
    //     }

    //     if (left < max) {
    //         backTrack(list, str + "(", left+1, right, max);
    //     }
    //     if (right < left) {
    //         backTrack(list, str + ")", left, right+1, max);
    //     }
    // } 


    // 1015
    // public void backTrack(List<String> list, String str, int left, int right, int max) {
    //     if (str.length() == max*2) {
    //         list.add(str);
    //         return;
    //     }
    //     if (left < max) {
    //         backTrack(list, str + "(", left+1, right, max);
    //     }
    //     if (right < left) {
    //         backTrack(list, str + ")", left, right+1, max);
    //     }
    // }
    // 1014
    // public void backTrack(List<String> list, String str, int left, int right, int max) {
    //     if (str.length() == max * 2) {
    //         list.add(str);
    //         return;
    //     }
    //     if (left < max) {
    //         backTrack(list, str + "(", left + 1, right, max);
    //     } 
    //     if (right < left) {
    //         backTrack(list, str + ")", left, right + 1, max);
    //     }
    // }
}
// @lc code=end

