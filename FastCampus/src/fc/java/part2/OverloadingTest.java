package fc.java.part2;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(35.6f, 56.7f);
        System.out.println("v = " + v);
        
        int vv = add(10, 50);
        System.out.println("vv = " + vv);
    }
    // 매개변수로 두개의 정수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의하라
    public static int add(int a, int b){
        int result = a+b;
        return result;
    }
    // 매개변수로 두개의 실수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의하라
    public static float add(float a, float b){ // type이 다르면 중복정의(MethodOverload) 가능
        float result = a+b;
        return result;
    }
}
