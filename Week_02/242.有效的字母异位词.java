import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // 法二：定义一个长度为26的整数数组，遍历第一个字符串，每个字母代表的位置数字+1
        //      遍历第二个字符串，每个字母代表的位置数字-1
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) return false;
        }
        return true;
        
        // 法一：排序后判断是否相等
        // char[] schar = s.toCharArray();
        // char[] tchar = t.toCharArray();
        // Arrays.sort(schar);
        // Arrays.sort(tchar);
        // return Arrays.equals(schar,tchar);

        
    }
}
// @lc code=end

