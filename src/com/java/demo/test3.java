package com.java.demo;

import java.util.Scanner;

/**
 * @Auther:lin
 * @Date:2023/02/16
 * @Content:超市做促销活动，草莓限时打 8 折。
 * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 */
public class test3 {
    public static Float subject3() {
        float totalPrice = 0;//设置总价初始值

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果的斤数：");
        int appleSize = sc.nextInt();//苹果的斤数
        System.out.println("请输入草莓的斤数：");
        int strawberrySize = sc.nextInt();//草莓的斤数
        System.out.println("请输入芒果的斤数：");
        int mangoSize = sc.nextInt();//芒果的斤数

        totalPrice = (float) (appleSize*8+strawberrySize*13*0.8+mangoSize*20);//总价
        System.out.println("商品的总价为：" + totalPrice);
        return totalPrice;

    }

    public static void main(String[] args){
        subject3();
    }
}
