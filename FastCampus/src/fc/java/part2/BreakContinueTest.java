package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        // char[]c ={'s','h','u','t','d','o','w','n'}; 배열의 값을 출력 중 'o'라는 문자를 만나면 반복을 중지하라.
        char[]c ={'s','h','u','t','d','o','w','n'};
        for (int i = 0; i < c.length ; i++) {
            if (c[i] == 'o'){
                System.out.println("중지");
                break;
            }
            System.out.print(c[i]);
        }

        int cnt=0;
        for (int i = 1; i <= 10; i++) {
            if (i%3!=0) {
                continue; // 3의 배수가 아닌 경우엔 cnt++을 실행하지 않는다
            }
            cnt++;
        }
        System.out.print("3의 배수의 개수 : "+cnt);
    }
}
