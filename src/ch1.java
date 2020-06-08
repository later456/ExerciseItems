/*
public  class ch1 {
    public static  void main (String[] args) {
        System.out.println ( "later" );
    }
}*/
/*
public class ch1 {
    public  static  void main(String[] args){
    System.out.println ( "123" );
    System.out.println ( "-123" );
    System.out.println ( "ASD" );
    System.out.println ( " " );
    System.out.println ( true );
    System.out.println ( false );
    }
}*/
/*
public class ch1 {
    public  static void main (String[] args) {
        int num1;
        num1 = 1;
        System.out.println ( num1 );
        num1 = 20;
        System.out.println ( num1 );
        int num2  = 123;
        System.out.println ( num2 );
        byte num3 = 127;
        System.out.println ( num3 );
        short num4 = 50;
        System.out.println ( num4 );
        long num5 = 999999999;
        System.out.println ( num5 );
        char zifu1 = 'a';
        System.out.println ( zifu1 );
        zifu1 = '中';
        System.out.println ( zifu1 );
    }
}
*/
/*public class ch1 {
    public static  void main(String[] args){
        System.out.println ( 1024 );
        System.out.println ( 3.14 );
        long num2 = 100;
        System.out.println ( num2 );
        double num3 = 2.5F;
        System.out.println ( num3 );
        float num4 = 30L;
        System.out.println ( num4 );
        int num5 = (int) 100000000L;
        System.out.println ( num5 );
        int num6 = (int)99999999999L;
        System.out.println ( num6 );

    }
}*/
/*
public class ch1{
    public static void main(String[] args) {
        String str = "hello";
        System.out.println ( str );
        System.out.println ( "hello "  + "world"  );
        System.out.println ( str+20+30 );
    }
}*/
/*public  class ch1 {
    public static void main (String[] args){
        cook();
        later();
    }
    public static void cook(){
        System.out.println ( "洗菜" );
        System.out.println ( "切菜" );
    }
    public static void later(){
        System.out.println ( "出售" );
    }
}*/
/*public class ch1{
    public static void main(String[] args){
        System.out.println ( "今天天气不错，正在压马路..突然发现一个网吧" );
        int age = 16;
        if ( age >= 18 ){
            System.out.println ( "可以上网" );
        }
        else {
            System.out.println ( "未成年，不允许上网" );
        }
    }
}*/
/*public  class ch1{
    public static void main(String[] args){
        int num = 13;
        if (num % 2 == 0){
            System.out.println ( "偶数" );
        }else {
            System.out.println ( "奇数" ) ;
        }
    }
}*/
/*import java.util.Scanner;
public class  ch1{
    public  static  void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "请输入x的值:" );
        int x =  sc.nextInt ();
        int y;
        if ( x >= 3 ){
            y = 2 * x + 1;
        }
        else if ( x > -1 && x < 3){
            y = 2 * x;
        }
        else {
            y = 2 * x - 1;
        }
        System.out.println ( "结果是："+y );
    }
}*/
/*import java.util.Scanner;
public class ch1{
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "输入你的成绩：" );
        int score =  sc.nextInt ();
        if (score >= 90 && score <= 100){
            System.out.println ( "成绩优秀" );
        }
        else if (score >= 80 && score < 90){
            System.out.println ( "成绩不错" );
        }
        else if (score >= 70 && score < 80){
            System.out.println ( "成绩良好" );
        }
        else if (score >= 60 && score < 70){
            System.out.println ( "成绩及格" );
        }
        else if (score >= 0 && score < 60){
            System.out.println ( "不及格" );
        }
        else {
            System.out.println ( "输入错误" );
        }
    }
}*/
/*public class ch1{
    public static void main(String[] args){
        int a = 10 ,b=20;
        int max = a > b ? a : b;
        System.out.println ("最大值:" + max );
    }
}*/
/*
import java.util.Scanner;
public  class   ch1{
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "num:" );
        int num = sc.nextInt ();
        switch (num){
            case 1:
                System.out.println ( "星期一" );
            case 2:
                System.out.println ( "星期二" );
                break;
            case 3:
                System.out.println ( "星期三" );
                break;
            default:
                System.out.println ( "数据不合理" );
                break;
        }
    }
}
*/
/*public class ch1 {
    public static void main(String[] args){
        for (int i = 0;i<=100;i++){
            System.out.println ( "later " + i );
        }
        System.out.println ( "end" );
    }
}*/
/*
public class ch1{
    public static void main(String[] args){
        int i = 1;
        while (i <= 10){
            System.out.println ( "later " +i);
            i++;
        }
    }
}*/
/*public class  ch1{
    public static void main(String[] args){
        int i = 1;
    do {
        System.out.println ( "later" );
        i++;
    } while (i <= 10);
    }
}*/
public class ch1{
    public static void main(String[] args){
        int sum = 0;
        for (int i=1;i<101;i++){
            if ( i % 2 == 0)
            sum += i;
        }
        System.out.println ( sum );
        System.out.println ( "--------------------" );
        int  later = 0,i = 0;
        while (i < 101){
            i++;
            if (i % 2 == 0) later += i;
        }
        System.out.println ( later );
        System.out.println ( "--------------------" );
        int docker = 0,j=0;
        do {
            j++;
             if (j % 2 == 0)
                 docker += j;
        }while (j<=100);
        System.out.println ( docker );
    }
}
