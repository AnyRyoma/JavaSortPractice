package com.github.littlejune.utils;

/**
 * Created by Littlejune on 2017/2/21.
 * 处理数组的工具类
 */
public class ArrayUtils {

    /**
     * 交换数据元素
     *
     * @param args
     * @param i
     * @param j
     */
    public static void exchange(int[] args, int i, int j) {
        int temp = args[i];
        args[i] = args[j];
        args[j] = temp;
    }

    /**
     * 打印数据元素
     *
     * @param args
     */
    public static void print(int[] args) {
        System.out.print("[");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
