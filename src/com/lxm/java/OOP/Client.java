package com.lxm.java.OOP;

import java.util.HashMap;
import java.util.Map;

class Father {
    public Map fun(HashMap map) {
        System.out.println("父类被执行...");
        return map;
    }
}

class Son extends Father {
    public HashMap fun(HashMap map) {
        System.out.println("子类被执行...");
        return map;
    }
}

public class Client {

    public static void main(String[] args) {
        System.out.print("父类的运行结果：");
        Father father = new Father();
        HashMap map = new HashMap();
        father.fun(map);

        //父类存在的地方，可以用子类替代
        //子类B替代父类A
        System.out.print("子类替代父类后的运行结果：");
        Son son = new Son();
        son.fun(map);
    }
}