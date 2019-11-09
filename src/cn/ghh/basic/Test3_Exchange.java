package cn.ghh.basic;

//这个类用来测试变量值的转换
public class Test3_Exchange {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int t = a;
        a = b;
        b = t;
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);
    }
}
