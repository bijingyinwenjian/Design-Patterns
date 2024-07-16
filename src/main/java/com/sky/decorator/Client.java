package com.sky.decorator;

public class Client {
    public static void main(String[] args) {
        // 两份巧克力+一份牛奶Longblack
        Drink order1 = new LongBlack();
        System.out.println("order1费用：" + order1.cost());
        System.out.println("order1描述：" + order1.getDescription());

        order1 = new Milk(order1);
        System.out.println("order1加一份牛奶费用：" + order1.cost());
        System.out.println("order1加一份牛奶描述：" + order1.getDescription());

        order1 = new Chocolate(order1);
        System.out.println("order1加一份牛奶,加一份巧克力费用：" + order1.cost());
        System.out.println("order1加一份牛奶,加一份巧克力描述：" + order1.getDescription());

        order1 = new Chocolate(order1);
        System.out.println("order1加一份牛奶,加两份巧克力费用：" + order1.cost());
        System.out.println("order1加一份牛奶,加两份巧克力描述：" + order1.getDescription());

        System.out.println("==============================");


        Drink order2 = new Decaf();
        System.out.println("无因咖啡费用：" + order2.cost());
        System.out.println("无因咖啡描述：" + order2.getDescription());

        order2 = new Milk(order2);
        System.out.println("无因咖啡，加一份牛奶费用：" + order2.cost());
        System.out.println("无因咖啡，加一份牛奶描述：" + order2.getDescription());
    }
}
