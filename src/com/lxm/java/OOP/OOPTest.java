package com.lxm.java.OOP;


import java.util.HashSet;

/**
 * 六大设计原则
 * *体现封装性的：**
 * 单一职责原则：类，接口，和方法只负责一件事，易读，易维护，通常接口和方法的单一职责更容易体现出来。
 * 接口隔离原则 ：将大的接口进行拆分多个粒度小的接口
 * <p>
 * 体现继承特性的：**
 * 里氏替换原则：需要复现父类的抽象方法,子类的访问权限大于父类，返回类型小于父类或等于父类
 * 依赖倒置原则：面向抽象（抽象类和接口）编程
 * <p>
 * **设计模式特性：***
 * 迪米特法则：只和你直接朋友交谈，不和陌生人接触。低耦合，提高模块独立性，案例：买房找中介，不要找各个楼盘。
 * 开闭原则：对扩展开放，对修改关闭。利用抽象构架，用实现扩展实现的细节。不修改ccmHandler,添加一个新的svcHandler，都继承BaseHandler
 */

public class OOPTest {
    public static void main(String[] args) {
        //driver只能开宝马车
        Driver driver = new Driver();
        driver.driveSingle(new BaoMaCar());

        driver.driver(new BENCHICar());
        driver.driver(new BaoMaCar());

        //equal和hashcode的使用
        EqualExample equalExample = new EqualExample(1, 1, 1);
        EqualExample equalExample2 = new EqualExample(1, 1, 1);
        HashSet<EqualExample> set = new HashSet<>();
        set.add(equalExample);
        set.add(equalExample2);
        System.out.println(set.size());
        System.out.println(equalExample.equals(equalExample2));
        System.out.println(equalExample == equalExample2);
    }
}
