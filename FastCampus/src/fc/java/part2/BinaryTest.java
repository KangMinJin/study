package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a= 10;
        float f = 35.6f; // 실수형은 double(8byte)이 기본형이기 때문에 float(4byte)는 끝에 f를 적어준다.
        boolean b = false;
        char c = 'A'; // char는 ''로 감싸준다
        String s = "APPLE"; // String은 ""로 감싸준다. java.lang.은 생략 가능
        // 69를 10진수, 2진수, 8진수, 16진수로 출력하라
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101; // 앞에 0b 가 붙으면 2진수
        System.out.println("binary = " + binary);
        int octal = 0105; // 앞에 0이 붙으면 8진수
        System.out.println("octal = " + octal);
        int hexa = 0x45; // 앞에 0x가 붙으면 16진수
        System.out.println("hexa = " + hexa);
    }
}
