/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {


    public int climbStairs(int n) {


        // 动态规划方法：
        // 1115
        // f(x) = f(x - 1) + f(x - 2)
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            
            p = q;
            q = r;
            r = p + q;
        }
        return r;



        // 1010
        // int p = 0 , q = 0 , r = 1;
        // for (int i = 1; i <= n; ++i) {
        //     p = q;
        //     q = r; 
        //     r = p+q;
        // }
        // return r;

        // 1002
        // 斐波那契数列
        // int p = 0, q = 0, r = 1;
        // for (int i = 1; i<=n; ++i) {
        //     p = q;
        //     q = r;
        //     r = p+q;
        // }
        // return r;


        // 0929
        // 理解：第n级台阶爬法，可以拆分为爬到第n-1级台阶的爬法数和第n-2级台阶的爬法数之和
        // 典型的斐波那契数列
        // int p = 0, q = 0, r=1;
        // for (int i = 1; i<=n; ++i) {
        //     p = q;
        //     q = r;
        //     r = p+q;
        // }
        // return r;


        // 0927
        // 斐波那契数列
        // f(n) = f(n-1) + f(n-2)
        // int p=0, q=0, r=1;
        // for (int i = 1; i<=n; ++i) {
        //     p = q;
        //     q = r;
        //     r = p+q;

        // }
        // return r;


        // int p = 0, q = 0, r = 1;
        // for (int i =1; i<=n; ++i) {
        //     p = q;
        //     q = r;
        //     r = p+q;
        // }
        // return r;

    }
}
// @lc code=end

