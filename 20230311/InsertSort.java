package com.lzl.algo.leetCode.array.easy;

public class InsertSort {

    // 插入排序，a表示数组，n表示数组大小
    public void sort(int[] a) {
        int flag = 0;
        int loops = 0;
        for (int i = 1; i < a.length; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                loops ++;
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                    flag ++;
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
        System.out.println("sort times "+flag+" loops times " + loops);
    }

    public static void main(String[] args) {

        InsertSort insertSort = new InsertSort();
        int[] sort = new int[]{2, 3, 5, 1, 7, 0};
        insertSort.sort(sort);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
