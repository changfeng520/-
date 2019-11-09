package cn.ghh.basic;

//这个类用来测试最大值最小值
public class Test1_Scope {
    public static void main(String[] args) {
        //整型数据类型分为：byte short int long
        //定义整型变量 变量类型 变量名=变量值
        //byte类型，最大值最小值
        byte bmax = Byte.MAX_VALUE;
        byte bmin = Byte.MIN_VALUE;
        System.out.println("Byte类型的最大值为"+bmax);
        System.out.println("Byte类型的最小值"+bmin);
        //short类型，最大值最小值
        short smax = Short.MAX_VALUE;
        short smin = Short.MIN_VALUE;
        System.out.println("short类型的最大值为"+smax);
        System.out.println("short类型的最小值"+smin);
        //int类型，最大值最小值
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println("int类型的最大值为"+imax);
        System.out.println("int类型的最小值为"+imin);
        //long类型，最大值最小值
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println("long类型的最大值为"+lmax);
        System.out.println("long类型的最小值"+lmin);
        System.out.println();
        //浮点型分为float double
        //float类型，最大值最小值
        float fmax = Float.MAX_VALUE;
        float fmin = Float.MIN_VALUE;
        System.out.println("float类型的最大值为"+lmax);
        System.out.println("float类型的最小值"+lmin);
        //double类型，最大值最小值
        double dmax = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println("double类型的最大值为"+dmax);
        System.out.println("double类型的最小值为"+dmin);
        System.out.println();
        //boolean 布尔类型
        boolean b1 = true;
        boolean b2 = false;
        //字符型 char
        char c = 'a';
        char c2 = '中';
        char c3 = 97;
        //当char类型存储数字时，底层会去查询ascii码表，把数字对应着的字符拿到使用
        //ascii码表里，只规定了数字0-127对应着的字符。128-65535默认字符都按照?处理
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);


    }
}
