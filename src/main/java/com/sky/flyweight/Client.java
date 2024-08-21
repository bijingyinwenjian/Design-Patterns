package com.sky.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("Jack"));
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("Smith"));

        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("King"));

        System.out.println("网站总数：" + factory.getWebSiteCount());
    }
}
