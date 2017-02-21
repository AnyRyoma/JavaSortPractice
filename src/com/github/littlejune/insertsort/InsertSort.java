package com.github.littlejune.insertsort;

import com.github.littlejune.utils.ArrayUtils;

/**
 * Created by Littlejune on 2017/2/21.
 *
 * 插入排序：
 * 把当前待排序的元素插入到一个已经排好序的列表里
 * 稳定排序算法
 * 时间复杂度:O(n^2)
 *
 */
public class InsertSort {

    /**
     * (直接)插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {

        int position;
        int currentValue;
        for (int i = 1; i < arr.length; i++) {
            position = i; // 记录元素插入位置
            currentValue = arr[i]; //记录待插入元素的值
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > currentValue) {
                    arr[j + 1] = arr[j];
                    position --;
                } else {
                    break;
                }
            }
            arr[position] = currentValue;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.print("排序前:");
        ArrayUtils.print(arr);
        insertSort(arr); // 插入排序
        System.out.print("排序后:");
        ArrayUtils.print(arr);
    }


}
