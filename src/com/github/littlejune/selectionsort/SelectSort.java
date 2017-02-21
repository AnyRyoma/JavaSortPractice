package com.github.littlejune.selectionsort;

import com.github.littlejune.utils.ArrayUtils;

/**
 * Created by Littlejune on 2017/2/21.
 * 选择排序
 * 分无序 有序两部分 从无序列表中选择出最小元素 元素交换
 * 是一种不稳定的算法
 * 时间复杂度:O(n^2)
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        /**
         * 参数检查
         */
        if (arr == null || arr.length < 2) {
            return;
        }

        int min; //记录最小元素的index
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j; // 修改最小元素
                }
            }

            ArrayUtils.exchange(arr, i, min);// 元素交换
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.print("排序前:");
        ArrayUtils.print(arr);
        selectSort(arr); // 选择排序
        System.out.print("排序后:");
        ArrayUtils.print(arr);
    }

}
