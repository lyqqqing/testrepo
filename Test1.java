package com.yiqinglu.demo;

public class Test1 {
    public static void main(String[] args) {
        //求数组最值
        //1.用数组装起来
        double[] scores = {7.5,45,50,100,47.5,-2.5};
        //2.定义一个变量用于记住最大值
        double max = scores[0];
        //3.从数组的第二个位置开始遍历
        for (int i = 1; i < scores.length; i++) {
            //判断当前遍历的数据是否大于最大值max存储的数据
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println(max);
    }
}