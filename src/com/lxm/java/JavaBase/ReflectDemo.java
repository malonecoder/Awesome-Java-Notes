package com.lxm.java.JavaBase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/*
 *  反射常用Demo
 *  类名.class、类型.getClass()、Class.forName("类名")等方法获取Class对象
 *  获取到Class对象以后就可以动态操作类上的方法，属性 ，类的实例化等
 * */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Logger.getLogger("log").info("根据类名:  \t" + ReflectObject.class);
        Logger.getLogger("log").info("根据对象:  \t" + new ReflectObject().getClass());
        Logger.getLogger("log").info("根据全限定类名:\t" + Class.forName("com.lxm.java.JavaBase.ReflectObject"));
        // 常用的方法
        Logger.getLogger("log").info("获取全限定类名:\t" + ReflectObject.class.getName());
        Logger.getLogger("log").info("获取类名:\t" + ReflectObject.class.getSimpleName());
        Logger.getLogger("log").info("实例化:\t" + ReflectObject.class.newInstance());

        Constructor<?>[] constructors = ReflectObject.class.getDeclaredConstructors();
        Method[] declaredMethods = ReflectObject.class.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println("method:" + m.getName());
            m.setAccessible(true);
            m.invoke(ReflectObject.class.newInstance(), null);
        }
        Field[] declaredFields = ReflectObject.class.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("field:" + f.getName());
            f.set(ReflectObject.class.newInstance(), "nameValue");
        }
    }
}
