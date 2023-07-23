package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index=1;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println(index);
                index++;
            }//_j
        }//_i

        int[][] a = {
                {1,2,3,4,5}
                ,{6,7,8,9,10}
        };
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
