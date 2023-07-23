package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼 항 연산자를 이용하여 정수 2개 중 max value와 min value를 출력하라
        int a = 10;
        int b = 20;
        // min value
        int min = (a > b) ? b : a;
        System.out.println("min = " + min);

        // max value
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
    }
}
