package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        float a=56.7f;
        float b=78.9f;
        // a+b=?
        floatAdd(a,b); // Call By Value
        System.out.println("종료");
        // 끝 -> 종료
    }
    // 매개변수로 2개의 실수를 받아서 총합을 구하여 출력하는 메서드를 정의하라
    public static void floatAdd(float a, float b) {
        float sum = a+b;
        System.out.println("sum = " + sum);
        // return;
    }
}
