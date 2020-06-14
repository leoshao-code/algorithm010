
//题目：旋转数组


//1.暴力法思路(目前我的解题思路只有这种)：数组向右移动，每移动一次，最后位置的元素都放到0位置上，因此，此算法的时间复杂度为O(n*k);空间复杂度为O(1)符合题干
class Solution {
    public void rotate(int[] nums, int k) {
        int temp, pre;
        for(int i = 0; i< k;i++){
            pre = nums[nums.length-1];//每向右移动一位，都要指向最后一个位置
            for(int j = 0; j < nums.length; j++){//数组的元素每向右移动一次，整个数组的元素都要往后移动一位，最后一位数组的元素放到第一位
                //交换位置
                temp = nums[j];
                nums[j]= pre;
                pre = temp;
            }
        }
    }
}


//2.使用反转(背诵的解题方法)
//原理：
//原始数组                  : 1 2 3 4 5 6 7
//反转所有数字后             : 7 6 5 4 3 2 1
//反转前 k 个数字后          : 5 6 7 4 3 2 1
//反转后 n-k 个数字后        : 5 6 7 1 2 3 4 --> 结果

public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);//反转整个数组
        reverse(nums, 0, k - 1);//反转前k个数组
        reverse(nums, k, nums.length - 1);//反转后K个数组
    }
    //反转方法
    //nums 数组
    //start:开始位置
    //end：结束位置
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}