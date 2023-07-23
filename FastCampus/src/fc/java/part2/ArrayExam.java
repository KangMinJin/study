package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        // 정수 1개를 저장할 변수를 선언하라.
        int a;
        a = 10;

        // 정수 3개를 저장할 변수를 선언하라.
        int[] b = new int[3];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;

        int[] x={1,2,3,4,5}; // 배열의 초기화
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        // char 배열에 APPLE이라는 문자가 저장되어있다. 대문자 APPLE을 소문자 apple로 출력하라.
        char[] c = {'A', 'P', 'P', 'L', 'E'};
        for (int i = 0; i < c.length ; i++) {
//            c[i] += 32;
            System.out.print((char)(c[i]+32));
        }
    }
}
