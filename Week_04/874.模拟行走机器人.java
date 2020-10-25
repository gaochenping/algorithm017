import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=874 lang=java
 *
 * [874] 模拟行走机器人
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {


        // 1025
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};// 北、东、南、西
        
        // 处理obstacles数组，按照格式：obstacle[0] + " " + obstacle[1]
        Set<String> obstacleSet = new HashSet<>();
        for (int[]obstacle : obstacles){
            obstacleSet.add(obstacle[0] + " " + obstacle[1]);
        }
        
        int x = 0, y = 0, direction = 0, maxDistSquare = 0;
        for (int i = 0; i < commands.length; ++i) {
            if (commands[i] == -2) { // 向左转
                direction = (direction + 3) % 4;
            } else if (commands[i] == -1) { // 向右转
                direction = (direction + 1) % 4;
            } else { // 向前走
                int step = 0;
                while (step < commands[i] && 
                    !obstacleSet.contains(
                        ((x + directions[direction][0]) + " " + (y + directions[direction][1]))
                    ) 
                ) {
                    x += directions[direction][0];
                    y += directions[direction][1];
                    step++;
                }
            }

            maxDistSquare = Math.max(maxDistSquare, x * x + y * y);
        
        }
        return maxDistSquare;
    }
}
// @lc code=end

