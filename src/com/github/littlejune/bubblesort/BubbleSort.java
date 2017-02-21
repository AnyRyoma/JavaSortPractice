package com.github.littlejune.bubblesort;

import com.github.littlejune.utils.ArrayUtils;

/**
 * Created by Littlejune on 2017/2/21.
 * 冒泡排序
 * 相邻量元素比较
 * 稳定算法
 * 时间复杂度 O(n^2)
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //排序的趟数
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    ArrayUtils.exchange(arr, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        System.out.print("排序前:");
        ArrayUtils.print(arr);
        bubbleSort(arr); // 冒泡排序
        System.out.print("排序后:");
        ArrayUtils.print(arr);
    }

}
