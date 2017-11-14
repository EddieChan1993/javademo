package ch3;

import ch2.Dog;

/**
 * 数组也是对象
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * int[]
         * 声明一个int数组变量
         * new int[3]
         * 创建一个大小为3的int类型数组
         * =
         * 将该数组引用赋值给nums
         *nums[0]=4
         * 赋予nums数组每一个元素一个int值
         */
        int[] nums = new int[3];

        nums[0] = 4;
        nums[1] = 4;
        nums[2] = 4;

        int[] nums2 = {1, 2, 3, 4};
        /**
         * 创建Dog数组
         */
        Dog[] pets;//生命一个Dog数组变量
        pets = new Dog[3];//创建大小为3的Dog类型数组<这不是创建Dog对象>，将其引用赋值给pets。
        // 有了dog引用，缺少实际的dog对象
        // 创建对象，并依次将对象引用复制给数组单元
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();
    }
}