package learnCode.day2;

/**
 * 方法重载允许在同一个类中定义多个方法名相同、但参数类型或个数不同的方法。
 * 
 * 是的，方法重载可以同时存在于同一个类中。只要方法名相同、参数类型或参数个数不同，编译器就能根据你实际传入的参数来自动选择调用哪个方法。
 * 
 * 例如：
 * add(1, 2) // 调用的是 int add(int a, int b)
 * add(1.5, 2.5) // 调用的是 double add(double a, double b)
 * add("A", "B") // 如果你定义了 add(String a, String b)，会调用字符串拼接方法
 * 
 * 如果参数类型可以自动转换（如 add(1, 2.0)），Java 会自动提升参数类型，并选择最合适的方法（这里会调用 double 版本）。
 */
public class MathUtils3 {

    /**
     * int 类型的加法方法
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * double 类型的加法方法
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * String 类型的“加法”方法，实现字符串拼接
     */
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils3 math = new MathUtils3();

        int sumInt = math.add(3, 5); // 调用 int 版本
        double sumDouble = math.add(2.1, 5.8); // 调用 double 版本
        double sumMix = math.add(5, 6.8); // 自动类型提升，调用 double 版本
        String sumString = math.add("Hello, ", "World!"); // 调用 String 版本

        System.out.println("sumInt: " + sumInt); // 输出 sumInt: 8
        System.out.println("sumDouble: " + sumDouble); // 输出 sumDouble: 7.9
        System.out.println("sumMix: " + sumMix); // 输出 sumMix: 11.8
        System.out.println("sumString: " + sumString); // 输出 sumString: Hello, World!
    }

    /*
     * 注意：如果再次定义如下方法，会编译报错，因为与上面的 int add(int a, int b) 方法签名完全相同：
     *
     * public int add(int x, int y) {
     * return x + y;
     * }
     *
     * // 编译错误：已经有一个 add(int, int) 方法了
     */
}