package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // a+b=?
        int s = StaticTest.sum(a,b);
        System.out.println("s = " + s); // 30
    }
        // 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드를 정의하라.
    public static int sum(int a, int b){
        int v = a+b;
        return v;
    }
}
