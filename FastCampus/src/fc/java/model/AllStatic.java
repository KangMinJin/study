package fc.java.model;

public class AllStatic {
    private AllStatic(){ // 생성자를 private로 선언해서 인위적으로 객체 생성을 막는다

    }
    public static int sum(int a, int b){
        int v = a + b;
        return v;
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int min(int a, int b){
        return a > b ? b : a;
    }
}
