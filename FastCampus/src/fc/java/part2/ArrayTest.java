package fc.java.part2;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 실수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하고 출력하라.
        float[] f = new float[5];
        for (int i=0; i < f.length; i++){
            f[i] = 10f;
            System.out.println("f["+i+"] = "+ f[i]);
        }
        // 정수 5개를 아래처럼 배열에 초기화 하고 index 0번째와 index 3번째 값을 더하여 출력하라.
        int[] a= {10, 20, 30, 40, 50};
        int sum = a[0] + a[3];
        System.out.println("a[0] + a[3] = " + sum);

        int[] b = new int[3];
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"] = "+ b[i]);
        }
        int[] c;
        c = new int[]{10, 20, 30, 40, 50};
    }
}
