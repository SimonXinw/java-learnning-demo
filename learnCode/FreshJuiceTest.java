package learnCode;

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
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }

    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        // System.out.println("Juice size >>>>>>>>: " + juice.size);

        // Color color = Color.RED;
        // System.out.println("Color >>>>>>>>: " + color.getDisplayName() + " " +
        // color.getCode());
    }
}