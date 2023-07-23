package fc.java.part2;

public class TwoDimArrayInit {
    public static void main(String[] args) {
        // 2차원 배열의 초기화(행 단위로 초기화)와 반복문을 활용한 원소 접근
        int[][] a={
                {1,2,3,4}
                ,{5,6,7,8}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(); // 개행처리
        }

        int[][] b = new int[5][]; // int[5]"[]" 이 부분은 가변
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];
        b[4] = new int[5];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = '★';
                System.out.print((char)b[i][j]+"\t"); // int이기 때문에 char로 캐스팅 해줘야 별이 제대로 출력된다.
            }
            System.out.println(); // 개행처리
        }
    }
}
