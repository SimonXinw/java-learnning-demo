package learnCode.day3;

/**
 * TypeTest 类用于演示 Java 不同数据类型的默认值。
 * 包括基本类型和对应的包装类（对象类型），
 * 并对比演示类变量（static）和对象变量（实例变量）的默认值情况。
 */
public class TypeTest {

    // 基本数据类型的静态成员变量（未显式赋值）
    static boolean bool; // 默认值为 false
    static byte by; // 默认值为 0
    static char ch; // 默认值为 '\u0000'（空字符）
    static double d; // 默认值为 0.0
    static float f; // 默认值为 0.0f
    static int i; // 默认值为 0
    static long l; // 默认值为 0L
    static short sh; // 默认值为 0
    static String str; // 引用类型 String 的默认值为 null

    // 包装类（对象类型）的静态成员变量（未显式赋值）
    static Boolean boolObj; // 默认值为 null
    static Byte byObj; // 默认值为 null
    static Character chObj; // 默认值为 null
    static Double dObj; // 默认值为 null
    static Float fObj; // 默认值为 null
    static Integer iObj; // 默认值为 null
    static Long lObj; // 默认值为 null
    static Short shObj; // 默认值为 null
    static String strObj; // String 默认值为 null

    // ====== 新增实例（对象作用域）变量，对比默认值（和静态变量一致） ======
    // 基本类型实例变量
    boolean iBool; // 默认值为 false
    byte iBy; // 默认值为 0
    char iCh;
    double iD; // 默认值为 0.0
    float iF; // 默认值为 0.0f
    int iI; // 默认值为 0
    long iL; // 默认值为 0L
    short iSh; // 默认值为 0
    String iStr; // 引用类型 String 的默认值为 null

    // 包装类实例变量
    Boolean iBoolObj; // 默认值为 null
    Byte iByObj; // 默认值为 null
    Character iChObj; // 默认值为 null
    Double iDObj; // 默认值为 null
    Float iFObj; // 默认值为 null                   
    Integer iIObj; // 默认值为 null
    Long iLObj; // 默认值为 null
    Short iShObj; // 默认值为 null
    String iStrObj; // 引用类型 String 的默认值为 null

    /**
     * 主方法，输出静态变量、实例变量（对象作用域）的默认值。
     */
    public static void main(String[] args) {

        System.out.println("基本类型（类变量 static）默认值：");

        // 输出每个基本类型静态变量的默认值
        System.out.println("Boolean    :" + bool);
        System.out.println("Byte       :" + by);
        System.out.println("Character  :" + ch); // char 默认值为不可见字符
        System.out.println("Double     :" + d);
        System.out.println("Float      :" + f);
        System.out.println("Integer    :" + i);
        System.out.println("Long       :" + l);
        System.out.println("Short      :" + sh);
        System.out.println("String     :" + str); // String 作为引用类型，默认值为 null

        System.out.println();

        System.out.println("包装类（类变量 static）默认值：");

        // 输出每个包装类静态对象的默认值
        System.out.println("Boolean    :" + boolObj);
        System.out.println("Byte       :" + byObj);
        System.out.println("Character  :" + chObj);
        System.out.println("Double     :" + dObj);
        System.out.println("Float      :" + fObj);
        System.out.println("Integer    :" + iObj);
        System.out.println("Long       :" + lObj);
        System.out.println("Short      :" + shObj);
        System.out.println("String     :" + strObj);

        System.out.println();

        // 创建 TypeTest 对象，输出其实例变量默认值
        TypeTest demo = new TypeTest();

        System.out.println("基本类型（对象变量/实例变量）默认值：");
        System.out.println("Boolean    :" + demo.iBool);
        System.out.println("Byte       :" + demo.iBy);
        System.out.println("Character  :" + demo.iCh);
        System.out.println("Double     :" + demo.iD);
        System.out.println("Float      :" + demo.iF);
        System.out.println("Integer    :" + demo.iI);
        System.out.println("Long       :" + demo.iL);
        System.out.println("Short      :" + demo.iSh);
        System.out.println("String     :" + demo.iStr);

        System.out.println();

        System.out.println("包装类（对象变量/实例变量）默认值：");
        System.out.println("Boolean    :" + demo.iBoolObj);
        System.out.println("Byte       :" + demo.iByObj);
        System.out.println("Character  :" + demo.iChObj);
        System.out.println("Double     :" + demo.iDObj);
        System.out.println("Float      :" + demo.iFObj);
        System.out.println("Integer    :" + demo.iIObj);
        System.out.println("Long       :" + demo.iLObj);
        System.out.println("Short      :" + demo.iShObj);
        System.out.println("String     :" + demo.iStrObj);
    }
}