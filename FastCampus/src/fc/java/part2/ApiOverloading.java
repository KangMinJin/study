package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE"); // Method의 Overloading
        int max = maxVal(7, 9);
        System.out.println("max = " + max); // 9
        int min = minVal(3, 8);
        System.out.println("min = " + min); // 3
    }
    // 두 개의 정수를 매개변수오 받아서 더 큰 수를 리턴하는 메서드를 정의하라.
    public static int maxVal(int a, int b){
        return (a>b) ? a : b;
    }
    // 두 개의 정수를 매개변수오 받아서 더 작은 수를 리턴하는 메서드를 정의하라.
    public static int minVal(int a, int b){
        return (a>b) ? b : a;
    }
}
