package com.feng._继承;
/**
 * 继承中构造方法的访问特点：
 *    子类所有的构造器都会默认访问父类中的无参构造方法
 *         因为子类都会继承父类中的数据，可能还会使用父类的数据，在子类初始化之前，父类必须初始化
 *     每一个子类的构造方法第一条语句默认是：super()
 *  如果父类只有带参构造方法，子类该怎么办？
 *     使用super调用有参构造器
 *     在父类中，自己创建一个无参构造方法(推荐使用)
 *     */
public class Demo {
    public static void main(String[] args) {
//        Fu f = new Fu();
//        f.show();
        Zi zi = new Zi();
        Zi z = new Zi(20);
//        z.show();
//        z.method();
    }
}
