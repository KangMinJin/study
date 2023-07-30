package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st = new AllStatic();
//        System.out.println(st.sum(10, 20)); // 30
//        System.out.println(st.max(10, 20)); // 20
//        System.out.println(st.min(10, 20)); // 10

        // static은 굳이 객체 생성 없어도 호출 가능
        System.out.println(AllStatic.sum(10, 20));
        System.out.println(AllStatic.max(10, 20));
        System.out.println(AllStatic.min(10, 20));

//        System sys = new System(); // private
//        System.
//        Math m = new Math(); // private
        System.out.println(Math.max(30, 60)); // 60
        System.out.println(Math.min(40, 10)); // 10
    }
}
