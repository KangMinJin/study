package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        int data = 123;
        // java.lang.생략 가능
        String binary = java.lang.Integer.toBinaryString(data); // Integer.toBinaryString은 int를 2진수로 바꿔준다
        System.out.println("binary = " + binary); // 1111011
        String octal = java.lang.Integer.toOctalString(data); // Integer.toOctalString은 int를 8진수로 바꿔준다
        System.out.println("octal = " + octal); // 173
        String hexa = java.lang.Integer.toHexString(data); // Integer.toHexString은 int를 16진수로 바꿔준다
        System.out.println("hexa = " + hexa); // 7b
        
        int x = 123;
        System.out.println("x = " + x);
        int y = 0b1111011;
        System.out.println("y = " + y);
        int z = 0173;
        System.out.println("z = " + z);
        int u = 0x7b;
        System.out.println("u = " + u);
    }
}
