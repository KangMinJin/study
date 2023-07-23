package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};

        int s1 = sum1(a);
        System.out.println("s1 = " + s1);
        int s2 = sum2(a);
        System.out.println("s2 = " + s2);
    }
    // 매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 출력하는 메서드를 정의하라
    // for문으로 구현
    public static int sum1(int[] a){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
    // foreach문으로 구현
    public static int sum2(int[] a){
        int result = 0;
        for (int val:a) {
            result += val;
        }
        return result;
    }
}
