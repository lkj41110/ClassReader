#ClassReader

**基于java的Class文件解析，具体过程可移步（原作者的简单介绍）[https://gold.xitu.io/post/589834a20ce4630056097a56](https://gold.xitu.io/post/589834a20ce4630056097a56)**  

**[深入理解Java Class文件格式](http://blog.csdn.net/zhangjg_blog/article/details/21486985)**

可用javap -v $classname 命令查看class文件

class解析过程：
1. 魔术数字
2. 常量池(根据tag判断常量池类型)
3. 类的信息
4. 父类的信息
5. 接口信息
6. 成员信息
7. 方法信息
