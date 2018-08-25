package com.date.structure.sort;

import com.date.structure.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QuickSort {
    //快速排序,递归实现
    //挖坑法
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        //得到基元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        //第一个元素作为基元素
        int pivot = arr[startIndex];
        int lefe = startIndex;
        int right = endIndex;
        //坑的位置
        int index = startIndex;
        while (right >= lefe) {
            //右指针
            while (right >= lefe) {
                //小于pivot进行填坑
                if (arr[right] < pivot) {
                    arr[lefe] = arr[right];//值替换
                    index = right;//新的坑位置
                    lefe++;//移动
                    break;//跳出循环
                }
                //大于进行左移
                right--;
            }
            //left指针
            while (right >= lefe) {
                //大于进行移坑
                if (arr[lefe] > pivot) {
                    arr[right] = arr[lefe];
                    index = lefe;
                    right--;
                    break;
                }
                //小于进行右移
                lefe++;
            }
        }
        arr[index] = pivot;
        return index;
    }

    //指针交换法
    public static void indicatorQuickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        int pivotIndex = indicator(arr, startIndex, endIndex);
        indicatorQuickSort(arr, startIndex, pivotIndex - 1);
        indicatorQuickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int indicator(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            //控制left指针比较并左移
            while (left < right && arr[right] > pivot) {
                right--;
            }
            //控制right指针比较并右移
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            //交换left和right指向的元素
            if (left < right) {
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }
        }
        //pivot和指针重合点交换
        int p = arr[left];
        arr[left] = arr[startIndex];
        arr[startIndex] = p;
        return left;
    }

    //快速排序非递归实现
    public static void quickSortWithStack(int[] arr, int startIndex, int endIndex) {
        //集合栈代替递归的函数栈
        Stack<Map<String, Integer>> stack = new Stack<>();
        //整个数列的起止下标，一哈希入栈
        Map<String, Integer> rootParam = new HashMap<>();
        rootParam.putIfAbsent("startIndex", startIndex);
        rootParam.putIfAbsent("endIndex", endIndex);
        if (stack.isEmpty()) {
            stack.push(rootParam);
        }
        //循环结束条件，栈为空
        while (!stack.isEmpty()) {
            //栈顶元素出栈，得到起止下标
            Map<String, Integer> param = stack.pop();
            //基元素位置
            int pivotIndex = indicator(arr, param.get("startIndex"), param.get("endIndex"));
            //根据基准元素分成两部分，吧每一部分的起止下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String, Integer> leftParam = new HashMap<>();
                leftParam.putIfAbsent("startIndex", param.get("startIndex"));
                leftParam.putIfAbsent("endIndex", pivotIndex - 1);
                stack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String, Integer> rightParam = new HashMap<>();
                rightParam.putIfAbsent("startIndex", pivotIndex + 1);
                rightParam.putIfAbsent("endIndex", param.get("endIndex"));
                stack.push(rightParam);
            }
        }
    }
}
