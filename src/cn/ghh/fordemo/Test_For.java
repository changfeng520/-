package cn.ghh.fordemo;

//        *
//
//        **
//
//        ***
//
//        ****
//
//        *****
//打印左直角三角形
public class Test_For {
    public static void main(String[] args) {
        //method();
        //method2();
        method3();
    }

    //打印全三角形
    private static void method3() {
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //99乘法表
    public static void method2() {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    //左直角三角形
    public static void method() {
        for (int i = 1; i <= 5; i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
