package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // System.in은 키보드입력을 사용 가능하게 한다.
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt(); // 입력하기 전 까지 블럭 상태(시스템이 잠깐 멈춰있는 상태)
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요 : ");
        String str = scan.next(); // scan.next()는 Hello" "world! 에서 공백을 기준으로 Hello만 읽는다
        System.out.println("str = " + str); // Hello

        scan.nextLine(); // 버퍼 비우기(스트림 비우기) Hello 뒤에 남아있는 World! 를 비워주는 역할
        // Hello 뒤에 남아있는 World! 를 비워주지 않으면 입력을 기다리지 않고 스트림에 남아있는 World! 만 출력한다.
        System.out.print("문자열을 입력하세요 : ");
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1); // Hello World!

        scan.close(); // scanner를 종료해준다.
    }
}
