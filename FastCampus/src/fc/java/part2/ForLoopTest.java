package fc.java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        // 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하라.
        for (char c='A'; c<='Z'; c++) {
            System.out.println(c+":"+(int)c);
        }

        for (char c='a'; c<='z'; c++) {
            System.out.println(c+":"+(int)c);
        }

        for (int i=65; i<=90; i++) {
            System.out.println((char)i+":"+i);
        }

        // int[] num = {1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하라
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        // foreach문 (향상된 for문)
        for (int su : num) {
            System.out.print(su+" ");
        }
    }
}
