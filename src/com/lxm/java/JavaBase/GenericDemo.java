package com.lxm.java.JavaBase;


import java.util.ArrayList;
import java.util.List;

/**
 * List<?>、 List<Object> 、 List
 * List<? extends A> List<? super A>
 * <p>
 * <?>被称作无限定的通配符。
 * <? extends T>被称作有上限的通配符。
 * <? super T>被称作有下限的通配符。
 */
public class GenericDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("aaa");
        //List<Object> oList = list;  Object是String父类  但List<Object> 不可以接收List<String>
        List<?> wildlist = new ArrayList<String>();
//        wildlist.add(123);// 编译不通过  只能调用 Collection 中与类型无关的方法
    }

    //PECS
    //请记住PECS原则：生产者（Producer）使用extends，消费者（Consumer）使用super。
    //HongFuShi->Apple->Fruit
    public static <T> void test(List<? super Apple> dest, List<? extends Apple> src) {
//        src.add(new Apple());  编译不通过
//        src.add(new Fruit());  编译不通过
//        src.add(new HongFuShi()); 编译不通过
          dest.add(new Apple());
          dest.add(new HongFuShi());
//        dest.add(new Fruit()); 编译不通过 因为dest限定范围为Apple到Apple所有的父类，当dest为范围最小也就是Apple时，不能添加Apple的父类Fruit

    }
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {

    }

}
