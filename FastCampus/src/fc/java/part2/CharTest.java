package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A
        int a = 'A';
        System.out.println("a = " + a); // 65(아스키코드값)
        int b = 'B' + 1;
        System.out.println("b = " + b); // 66 + 1 = 67
        System.out.println("b = " + (char)b); // (char로 형변환) C
        // '가' 라는 한글 한 문자를 변수에 저장하고 출력하라.
        char han = '가';
        System.out.println("han = " + han); // 가
        int hanD = '가';
        System.out.println("hanD = " + hanD); // 44032
        int hanU = '\uAC00'; // 유니코드
        System.out.println("hanU = " + (char)hanU); // 가
        // 대문자 'A'를 문자 'a'로 변환하여 출력하라
        char upper = 'A';
        char lower =  (char)(upper+32); // 대문자에 32를 더하면 소문자가 된다.(아스키코드표 참고)
        System.out.println("lower = " + lower); // a
        char lower1='u'; // 117
        int upper1 = lower1-32; // 117 - 32 = 85(U)
        System.out.println("upper1 = " + upper1); // 85
        System.out.println("upper1 = " + (char)upper1); // 85 -> U
        
        // '1' + '2'' = 3 이 나오도록 프로그래밍 하라
        int data = '1' + '2';
        System.out.println("data = " + data); // 아스키코드 값이 더해져 99
        // '0'의 카스키 코드 값 : 48
        char i = '1'; // 49 - 48 = 1
        char j = '2'; // 50 - 48 = 2
        int sum = (i-'0') + (j-'0');
        System.out.println("sum = " + sum); // 3
    }
}
