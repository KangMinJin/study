package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=-10;
        if (x>0) {
            System.out.println("양수입니다");
        } else if (x==0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
        // 정수 1개를 입력받아 짝수인지 홀수인지를 판단하는 프로그램을 작성하라
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 > ");
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // 정수 1개를 입력받아 12의 배수인지를 판단하는 프로그램을 작성하라
        System.out.print("정수를 입력해주세요 > ");
        int su = scan.nextInt();
        if (su % 12 == 0){
            System.out.println("12의 배수입니다.");
        } else {
            System.out.println("12의 배수가 아닙니다.");
        }
        // 년도를 입력 받아서 윤년인지 아닌지 판단하는 코드를 작성하라
        // 윤년 : 4의 배수인 년도에서 100으로 나누어 떨어지는 년도를 제외하고 400의 배수인 년도
        System.out.print("년도를 입력하세요. > ");
        int year = scan.nextInt();
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
