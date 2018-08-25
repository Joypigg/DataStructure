package com.date.structure;

public class TreePrinter {

    /*======================================打印二叉树===================================================*/
    //按层遍历并打印换行信息
    public static int[][] printTree(Node root) {
        if (root == null) return null;

        return null;
    }

    //按先序遍历
    public static void preOrderRecur1(Node root) {
        if (root == null) return;
        System.out.println(root.item + " ");
        preOrderRecur1(root.prev);
        preOrderRecur1(root.next);
    }

    //非递归
    public static void preOrderRecur2(Node root) {
        if (root == null) return;
        if (root != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                System.out.println(root.item + " ");
                if (root.next != null) stack.push(root.next);
                if (root.prev != null) stack.push(root.prev);
            }
        }
    }
    //按中序遍历
    public static void inOrderRecur(Node root){
        if (root==null) return;
        if (root!=null){
            Stack<Node> stack=new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()){
                stack.push(root.prev);
            }
        }
    }
    //按后序遍历

    /*=====================================序列化/反序列化二叉树======================================================*/
//序列化

//反序列化

}
