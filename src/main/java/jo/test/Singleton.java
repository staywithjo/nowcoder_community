package jo.test;

/**
 * Date:2024/4/7
 * Author:Jo
 * Description:Eager Initialization饿汉模式
 */
public class Singleton {
//    //饿汉模式
//    private static Singleton instance = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return instance;
//    }

//    //懒汉模式
//    private static Singleton instance = null;
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        if(null == instance){
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    //双重锁校验模式
//    private static volatile Singleton instance = null;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (null == instance) {
//            synchronized (Singleton.class) {//同步锁
//                if (null == instance) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
    //静态内部类
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}

