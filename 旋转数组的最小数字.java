package com.biggw.niuke;

public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len==0)
            return 0;
        if (len == 1)
            return array[0];

        int left = 0, right = len-1;
        int mid = 0;
        while (left < right) {
            if (array[left] < array[right])
                return array[left];

            // 取整
            mid = left + (right-left)/2;
            if (array[left] < array[mid])
                // mid比left大，mid肯定不会为最小的了，所以一定在后面，所以是left=mid+1
                left = mid+1;
            // 这儿之所以用right=mid,举例：4,5,1,2,3  3比1大，但是最小值就是1，所以我们不能放过1，还需要判断
            else if (array[right] > array[mid])
                right = mid;
            else
                left++;

        }

        return array[left];
    }
}


/*
class Solution:
        def minNumberInRotateArray(self, rotateArray):
        # write code here
        s_len = len(rotateArray)
        if s_len == 0:
        return 0
        if s_len == 1:
        return rotateArray[0]
        if rotateArray[0]<rotateArray[-1]:
        return rotateArray[0]
        left, right = 0, s_len-1

        while left<right:
        mid = (left+right)//2
        if rotateArray[mid]<rotateArray[right]:
        right = mid
        else:
        left = mid+1

        return rotateArray[left]*/
