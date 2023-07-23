package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f; // 0.10
        System.out.println("f1 = " + f1); // 0.1
        float f2 = 15f;
        System.out.println("f2 = " + f2); // 12.0
        float f3 = 3.14f;
        System.out.println("f3 = " + f3); // 3.14
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);
        
        float x = 15.6f;
        int y = (int)x; // int로 강제 형변환(데이터 손실 발생)
        System.out.println("y = " + y); // 15
        
        char c = 'A';
        int cc = c; // 자동형변환
        System.out.println("cc = " + cc); // 65
        
        int dd = 5;
        double ddd = dd; // 자동형변환
        System.out.println("ddd = " + ddd); // 5.0

        double dx = 14.67;
//        int dy = dx; // 큰 타입을 작은 타입으로 바꾸는건 자동형변환 X
        int dy = (int)dx; // 그렇기에 강제형젼환 필요
        System.out.println("dy = " + dy); // 14
    }
}
