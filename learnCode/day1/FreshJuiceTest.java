package learnCode.day1;
// 2. 枚举中定义方法、变量、构造函数的示例

// 枚举中定义方法、变量、构造函数的示例
/**
 * Color 枚举演示了 Java 中如何为枚举类型添加属性、构造函数和方法。
 * 
 * 每个枚举常量（RED、GREEN、BLUE）都携带了两个参数（显示名和编码），
 * 同时 Color 枚举定义了私有成员变量、构造方法和用于获取属性的方法。
 */
enum Color {
    /**
     * RED 表示红色，显示名为"红色"，编码为1
     */
    RED("红色", 1),
    /**
     * GREEN 表示绿色，显示名为"绿色"，编码为2
     */
    GREEN("绿色", 2),
    /**
     * BLUE 表示蓝色，显示名为"蓝色"，编码为3
     */
    BLUE("蓝色", 3);

    /**
     * displayName 表示颜色的中文显示名，如 "红色"
     */
    private final String displayName;

    /**
     * code 表示该颜色的唯一编码
     */
    private final int code;

    /**
     * 私有构造函数
     * 
     * @param displayName 颜色的显示名
     * @param code        颜色编码
     * 
     *                    每个枚举常量声明时会调用此构造方法，传入各自的参数
     */
    // 枚举的构造器名必须与枚举类型名相同（即 Color），不能改成别的
    Color(String displayName, int code) {
        this.displayName = displayName;
        this.code = code;
    }

    /**
     * 获取颜色的显示名
     * 
     * @return 颜色的中文显示名
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 获取颜色编码
     * 
     * @return 颜色编码
     */
    public int getCode() {
        return code;
    }
}

class FreshJuice {
    /**
     * FreshJuiceSize 枚举表示果汁杯的尺寸
     */
    enum FreshJuiceSize {
        SMALL, // 小杯
        MEDIUM, // 中杯
        LARGE // 大杯
    }

    /**
     * size 表示当前果汁对象的尺寸
     * 需要声明为 public，是为了方便在类的外部（如 main 方法或其它类）能够直接访问和设置该果汁的尺寸。
     * 例如：juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
     * 这样可以简单直观地对对象的状态进行赋值和读取，适用于演示、学习等简单场景。
     */
    // 这里定义 public FreshJuiceSize size; 是为了让每个 FreshJuice 实例可以记录自己的尺寸信息
    // 如果你只想单纯用 FreshJuice.FreshJuiceSize.MEDIUM，而不用 size 字段，那么可以只用枚举，不需要定义 FreshJuice 类中的 size 成员变量
    public FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        // 这里可以直接通过 FreshJuice.FreshJuiceSize.MEDIUM 访问，是因为 FreshJuiceSize 是 FreshJuice
        // 类中定义的一个 public static 类型的枚举
        // Java 中的嵌套 enum 默认是 static，因此可以通过类名.枚举名.成员 来直接访问
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        // System.out.println("Juice size >>>>>>>>: " + juice.size);

        Color color = Color.RED;
        System.out.println("Color >>>>>>>>: " + color.getDisplayName() + " " +
                color.getCode());
    }
}