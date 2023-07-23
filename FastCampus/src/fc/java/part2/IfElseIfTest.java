package fc.java.part2;

public class IfElseIfTest {
    public static void main(String[] args) {
        // 80점 이상인 사람들 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반, 80 미만이면 불합격 처리하는 프로그램을 작성하라
        // 단, 점수는 0~100 사이로 입력받는다.
        int jum = 800;
        if (jum >= 0 && jum <= 100){
            if (jum >= 80) { // 중첩 if문
                if (jum >= 90) {
                    System.out.println("A반");
                } else if (jum >= 85) { // 다중 if문
                    System.out.println("B반");
                } else {
                    System.out.println("C반");
                }
            } else { // 79~0
                System.out.println("불합격");
            }
        } else { // 블럭 if문
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}
