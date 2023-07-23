package fc.java.part2;

public class GuGuDanTest {
    public static void main(String[] args) {
        // 이중 반복문을 이용하여 구구단을 출력하라
        for (int i = 2; i < 10; i++) {
            System.out.print(i+"단"+"\t\t");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i+"X"+j+"="+(i*j));
//            }
        }
        // 2X2=4    3x2=6   4x2=8 ~ 9x2=18
        System.out.println();
        for (int i = 1; i <=9 ; i++) {
            for (int j = 2; j <=9 ; j++) {
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
