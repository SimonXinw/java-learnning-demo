package learnCode.day3;

// 对类变量和方法的访问可以直接使用 classname.variablename 和 classname.methodname 的方式访问。
// 这个类演示了如何使用静态变量来计数对象的实例。静态变量属于类，而不是属于对象。因此，所有对象共享同一个静态变量。
// 这个类演示了如何使用静态方法来访问静态变量。静态方法属于类，而不是属于对象。因此，所有对象共享同一个静态方法。
// 这个类演示了如何使用构造器来计数对象的实例。构造器属于类，而不是属于对象。

public class InstanceCounter4 {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter4() {
        InstanceCounter4.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                InstanceCounter4.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter4();
        }
        System.out.println("Created " +
                InstanceCounter4.getCount() + " instances");
    }
}

final class Test4 {
    final static int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue() {
        // 因为 value 是 final 修饰的常量，final 变量一旦赋值后就不能被修改，
        // 所以下面赋值会导致编译错误。
        // value = 12; // 将输出一个错误
        System.out.println("value >>>>>>>>: " + value);
    }

    // transient 关键字的作用：
    // 被 transient 修饰的成员变量在对象序列化时不会被持久化（即不会写入到序列化后的字节流中）。
    // 通常用于包含敏感信息或临时数据的字段，防止其被序列化，增加安全性或节省空间。
    public transient int limit = 55; // 不会持久化到序列化结果中
}