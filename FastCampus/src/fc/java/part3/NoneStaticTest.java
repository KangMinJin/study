package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest(); // none-static method는 객체를 생성해서 메모리에 로딩 시켜야 사용가능하다.
        int s = st.sum(a,b);
        System.out.println("s = " + s);
    }
    public int sum(int a, int b){ // None-static Method
        int v = a+b;
        return v;
    }
}
