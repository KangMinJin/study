// 두 개의 정수를 사칙연산하여 출력하는 JavaSe프로그램을 만들어보자.
// 두 개의 정수는 12와 2이다.
// 변수는 a,b 를 만들어 사용할 것.
public class FourArithmetic {
    public static void main(String[] args) {
        int a,b,result;
        a = 12;
        b = 2;
//        result = a + b;
        System.out.println("a + b = " + (a+b)); // 굳이 결과 변수 선언 안 하고 이렇게 바로 해줘도 됨.
//        result = a - b;
        System.out.println("a - b = " + (a-b));
//        result = a * b;
        System.out.println("a * b = " + (a*b));
//        result = a / b;
        System.out.println("a / b = " + (a/b));
    }
}
