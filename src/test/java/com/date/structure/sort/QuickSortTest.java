package com.date.structure.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {


    @Test
    public void quickSort() {//挖坑法
        int[] arr = {4, 7, 6, 5, 3, 2, 8, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(arr1, arr);
    }

    @Test
    public void indicatorQuickSort() {//双向指针法
        int[] arr = {4, 7, 6, 5, 3, 2, 8, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        QuickSort.indicatorQuickSort(arr, 0, arr.length - 1);
        assertArrayEquals(arr1, arr);
    }

    @Test
    public void quickSortWithStack() {//双向指针的非递归实现
        int[] arr = {4, 7, 6, 5, 3, 2, 8, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        QuickSort.quickSortWithStack(arr, 0, arr.length - 1);
        assertArrayEquals(arr1, arr);
    }
}