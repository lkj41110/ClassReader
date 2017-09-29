package com.wangxiandeng.classreader;

/**
 * Created by wanginbeijing on 2017/1/24.
 */
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.setA(1);

        ClassReader classReader = new ClassReader();
        classReader.read("out/production/ClassReader/com/wangxiandeng/classreader/C.class");


    }

}

class A {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

interface B {
    void display();
}

class C extends A implements B {
    private int b;

    @Override
    public void display() {

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
