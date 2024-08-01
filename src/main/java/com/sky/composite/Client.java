package com.sky.composite;

public class Client {
    public static void main(String[] args) {
        MenuComponent root = new Menu("系统管理", 0);
        MenuComponent menu1 = new Menu("菜单管理", 1);
        MenuComponent menu2 = new Menu("权限配置", 1);
        MenuComponent menuItem1 = new MenuItem("页面访问", 2);
        MenuComponent menuItem2 = new MenuItem("展开菜单", 2);
        MenuComponent menuItem3 = new MenuItem("编辑菜单", 2);
        MenuComponent menuItem4 = new MenuItem("删除菜单", 2);
        MenuComponent menuItem5 = new MenuItem("新增菜单", 2);
        MenuComponent menuItem6 = new MenuItem("页面访问", 2);
        MenuComponent menuItem7 = new MenuItem("提交保存", 2);
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menu1.add(menuItem4);
        menu1.add(menuItem5);
        root.add(menu1);
        menu2.add(menuItem6);
        menu2.add(menuItem7);
        root.add(menu2);
        root.print();

    }
}
