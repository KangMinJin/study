public class VDATest {
    public static void main(String[] args) {
        // [정수 : int] 한 개를 저장하기 위해서 [변수를 선언] 하시오.
        int v; // 변수 선언 -> 기억 공간
        v = 10;
        System.out.println("v = " + v); // v = 10
        // 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하라.
        int a = 10; // 변수초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);
        // sum이라는 변수에 1~5까지의 수를 더해서 출력하라.
//        int sum = 1;
//        sum = sum + 2;
//        sum = sum + 3;
//        sum = sum + 4;
//        sum = sum + 5;
//        System.out.println("sum = " + sum);
        // for문으로
        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        // x = 10, y = 20을 저장하고 변수의 값을 서로 교환하여 출력하라.
        int x = 10;
        int y = 20;
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x +", y = " + y);
    }
}
