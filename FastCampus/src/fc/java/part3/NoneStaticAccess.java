package fc.java.part3;

import fc.java.model.MyUtil;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil
        MyUtil ut = new MyUtil(); // MyUtil.sum1()은 static 이 아니므로 객체 생성해서 접근
        int s = ut.sum1(a,b);
        System.out.println("s = " + s); // 30
    }
}
