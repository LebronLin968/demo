package com.java.demo;
import java.util.Scanner;

/**
 * @Auther:lin
 * @Date:2023/02/16
 * @Content:超市增加了一种水果芒果，其定价为 20 元/斤。
 * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价
 */
public class test2 {
    public static Integer subject2() {
        int totalPrice = 0;//设置总价初始值

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果的斤数：");
        int appleSize = sc.nextInt();//苹果的斤数
        System.out.println("请输入草莓的斤数：");
        int strawberrySize = sc.nextInt();//草莓的斤数
        System.out.println("请输入芒果的斤数：");
        int mangoSize = sc.nextInt();//芒果的斤数

        totalPrice = appleSize*8+strawberrySize*13+mangoSize*20;//总价
        System.out.println("商品的总价为：" + totalPrice);
        return totalPrice;

    }

    public static void main(String[] args){
        subject2();
    }
}
