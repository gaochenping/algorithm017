# 学习笔记

高晨平  2020.10.24

### 问题：使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

思路：

1、 无序的地方的判定条件：前一个数大于后一个数

2、二分查找，若 nums[mid] > nums[left] 说明无序的地方在右半部分，向后归约，否则无序的地方在左半部分，向前规约。

具体代码如下：

```java
public int[] findDisOrder(int[] nums) {
  
  if (nums.length <= 3) {
    return null;
  }
  
  int left = 0, right = nums.length - 1,mid;
  while (left <= right) {
    mid = left + (right - left) / 2;
    if (nums[mid] < nums[mid - 1]) retrun new int[] {mid - 1, mid};
    
    if (nums[mid] > nums[left] ) { //说明：无序的点是在右半部分：
      left = mid;
    } else { 
      right = mid;
    }
  }
  return null;

}
```



### 本周学习总结：

自身基础比较一般，这两周感觉有点吃力，前面的还没完全消化，还要继续学新内容。现在打算调整：

1. 课程需要做笔记的听，不能泛泛地听，要记下来各种数据结构一般在什么情况下用、各类代码模板都记清楚；
2. 把前面还没练的练习继续练，五毒神掌过遍数；
3. 新课程继续跟，把要求做的作业都做了，至少把简单的题目都做了。

