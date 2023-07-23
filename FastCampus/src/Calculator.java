import java.util.Arrays;

// 클래스 단위로 코딩을 한다.
// 시작, 메인 클래스
// 이와 같은 형태를 JavaSE 프로그램이라고 부른다.
public class Calculator {
    // main(){  } 메서드
    public static void main(String[] args) {
        // 두 개의 정수를 더하여 출력하는 자바 프로그램을 만들어 보자.
        int a, b, sum;
        a = 1;
        b = 1;
        sum = a+b;
        // 출력 : sout
        System.out.println(sum); // 2
        // soutv
        System.out.println("sum = " + sum); // sum = 2
        // soutm
        System.out.println("Calculator.main");
        // soutp
        System.out.println("args = " + Arrays.toString(args));
    }
}
