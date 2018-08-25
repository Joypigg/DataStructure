package com.date.structure.sort;

public class BubbleSort {
    //冒泡排序
    public static void sort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //判断是否已经部分有序问题
    public static void improveSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    //有序边界判断的冒泡排序
    public static void border(int[] arr) {
        int temp = 0;
        //最后一次交换位置
        int lastExchangeIndex = 0;
        //数列边界
        int sortBorder = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) break;
        }
    }

    //鸡尾酒排序{2, 3, 4, 5, 6, 7, 8, 1}
    public static void cockTailSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length >> 1; i++) {
            boolean isOrder = true;
            //奇数轮
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isOrder = false;
                }
            }
            //偶数轮
            for (int j = arr.length - i - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isOrder = false;
                }
            }
            if (isOrder) break;
        }
    }

    //包换有序边界的改善鸡尾酒排序
    public static void improveCockTailSort(int[] arr) {
        int temp = 0;
        int lastRightExchangeIndex = 0;//右侧最后一次交换的位置
        int rightSortBorder = arr.length - 1;//右边界
        int lastLeftExchangeIndex = 0;//左侧最后一次交换的位置
        int leftSortBorder = 0;//左边界
        for (int i = 0; i < arr.length >> 1; i++) {
            boolean isOrder = true;
            //奇数轮
            for (int j = leftSortBorder; j < rightSortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isOrder = false;
                    lastRightExchangeIndex = j;
                }
            }
            rightSortBorder = lastRightExchangeIndex;
            if (isOrder) break;
            //偶数轮
            for (int j = rightSortBorder; j > leftSortBorder; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isOrder = false;
                    lastLeftExchangeIndex = j;
                }
            }
            leftSortBorder = lastLeftExchangeIndex;
            if (isOrder) break;
        }
    }
}
