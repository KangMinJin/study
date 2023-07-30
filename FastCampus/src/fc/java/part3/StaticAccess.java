package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int s = MyUtil.sum(a,b); // MyUtil.sum()은 static 이므로 객체 생성 필요 X
        System.out.println("s = " + s); // 30
    }
}
