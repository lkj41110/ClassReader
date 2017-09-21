package com.wangxiandeng.classreader;

import com.wangxiandeng.classreader.basicinfo.MemberInfo;

/**
 * Created by wanginbeijing on 2017/1/24.
 */
public class ClassFile {
    public long magic; //魔术数字
    public int minorVersion;
    public int majorVersion; //版本
    public ConstantPool constantPool; //常量池
    public int accessFlag;
    public String className; //类名
    public String superClass;
    public int interfaceCount;
    public String[] interfaces;
    public int fieldCount;
    public MemberInfo[] fields;
    public int methodCount;
    public MemberInfo[] methods;

    @Override
    public String toString() {
        System.out.println("classname: " + this.className);
        System.out.println("superclass:" + this.superClass);


        return "ClassFile{}";
    }
}
