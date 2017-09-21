package com.wangxiandeng.classreader;

/**
 * Created by wanginbeijing on 2017/1/24.
 */
public class Test {
    public static void main(String[] args) {

        ClassReader classReader = new ClassReader();
        classReader.read("out/production/ClassReader/com/wangxiandeng/classreader/Test.class");

    }

}
