package learnCode.day3;

import java.util.Arrays;

/**
 * 本类演示数组相关的静态方法的常用用法：
 * 1. Arrays.binarySearch：二分查找已排序数组中的元素
 * 2. Arrays.equals：判断数组内容是否完全相等
 * 3. Arrays.fill：将数组填充值
 * 4. Arrays.sort：对数组进行排序
 */
public class ArrayTest {

    public static void main(String[] args) {

        // 1. Arrays.binarySearch(Object[] a, Object key)
        // 前提：数组必须是有序的！
        Integer[] intArray = { 10, 3, 7, 9, 23, 21 };

        // 先排序
        Arrays.sort(intArray);
        // intArray：[3, 7, 9, 10, 21, 23]

        // 查找元素9的索引
        int idx = Arrays.binarySearch(intArray, 9);
        System.out.println("9 在有序intArray数组中的索引是: " + idx);

        // 查找不存在的元素5
        int notFound = Arrays.binarySearch(intArray, 5);
        System.out.println("5 在有序intArray数组中的查找返回值: " + notFound + "（负数表示未找到，插入点是"
                + (-(notFound + 1)) + "）");

        // 2. Arrays.equals(long[] a, long[] a2)
        long[] lArr1 = { 1L, 2L, 3L };
        long[] lArr2 = { 1L, 2L, 3L };
        long[] lArr3 = { 3L, 2L, 1L };

        System.out.println("lArr1 与 lArr2 内容是否相等: " + Arrays.equals(lArr1, lArr2)); // true
        System.out.println("lArr1 与 lArr3 内容是否相等: " + Arrays.equals(lArr1, lArr3)); // false

        // 3. Arrays.fill(int[] a, int val)
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 99); // 全部填充为99
        System.out.println("fillArr 填充值后: " + Arrays.toString(fillArr)); // [99, 99, 99, 99, 99]

        // 4. Arrays.sort(Object[] a)
        String[] strArr = { "banana", "apple", "pear", "orange" };
        Arrays.sort(strArr); // 根据字符串字典顺序排列
        System.out.println("排序后的字符串数组: " + Arrays.toString(strArr)); // [apple, banana, orange, pear]

        // 同样方法适用于基本类型数组(如 int[], double[] 等)
        double[] doubleArr = { 3.1, 1.5, 2.9 };
        Arrays.sort(doubleArr);
        System.out.println("排序后的 double 数组: " + Arrays.toString(doubleArr)); // [1.5, 2.9, 3.1]
    }
}
