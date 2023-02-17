package com.java.demo;
import java.util.Scanner;

/**
 * @Auther:lin
 * @Date:2023/02/16
 * @Content:促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
 * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 */
public class test4 {
    public static Double subject4() {
        double promotionPrice;//促销后的总价
        double totalPrice;//为促销时的总价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果的斤数：");
        int appleSize = sc.nextInt();//苹果的斤数
        System.out.println("请输入草莓的斤数：");
        int strawberrySize = sc.nextInt();//草莓的斤数
        System.out.println("请输入芒果的斤数：");
        int mangoSize = sc.nextInt();//芒果的斤数

        totalPrice = appleSize*8+strawberrySize*13*0.8+mangoSize*20;//最终的总价
        promotionPrice = appleSize*8+strawberrySize*13*0.8+mangoSize*20;//每次100元以上时从总价减去的钱
        while(promotionPrice >= 100){
            totalPrice = totalPrice - 10;
            promotionPrice -= 100;
        }
        System.out.println("商品的总价为：" + totalPrice);
        return totalPrice;
    }
    public static void main(String[] args){
        subject4();
    }
}
