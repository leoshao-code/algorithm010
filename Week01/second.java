
//题目： 删除排序数组中的重复项



//暴力方法(方法可行，但是不满足题干)：1.使用两个数组，一个数组是原来的数组，一个是新的数组
//双指针法：(快慢指针)

class Solution {

    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j = 1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}