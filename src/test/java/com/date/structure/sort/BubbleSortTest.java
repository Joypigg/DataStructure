package com.date.structure.sort;

import org.junit.Test;

import static org.junit.Assert.*;

//快速排序
public class BubbleSortTest {

    @Test
    public void sort() {//原始冒泡排序
        int[] arr = {5, 8, 6, 3, 9, 2, 1, 7};
        int[] arr1 = {1, 2, 3, 5, 6, 7, 8, 9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void improveSort() {//有序判断的冒泡排序
        int[] arr = {5, 8, 6, 3, 9, 2, 1, 7};
        int[] arr1 = {1, 2, 3, 5, 6, 7, 8, 9};
        BubbleSort.improveSort(arr);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void border() {//有序交换边界的判断
        int[] arr = {3, 4, 2, 1, 5, 6, 7, 8};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        BubbleSort.border(arr);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void cockTailSort() {//鸡尾酒排序
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        BubbleSort.cockTailSort(arr);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void improveCockTailSort() {//改善的有序边界的鸡尾酒排序
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        BubbleSort.improveCockTailSort(arr);
        assertArrayEquals(arr, arr1);
    }
}