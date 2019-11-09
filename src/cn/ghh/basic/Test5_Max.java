package cn.ghh.basic;

//求三个数的最大值
//三元运算符 a>b?a:b
public class Test5_Max {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 4;
        int max=a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}
