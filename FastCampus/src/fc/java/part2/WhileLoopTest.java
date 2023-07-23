package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        // 0~5까지의 수를 출력하라
        int i = 0; // 초기식
        while (i<=5){ // 조건식
            System.out.print(i+" ");
            i++; // 증감식
        }
        System.out.println();
        // int[] num = {1,2,3,4,5,6,7,8,9,10}; 주어진 배열의 모든 원소를 출력하라
        int[] num = {1,2,3,4,5,6,7,8,9,10};
         i = 0;
         while (i< num.length) {
             System.out.print(num[i]+" ");
             i++;
         }
        System.out.println("\t"+i); // i가 10이 되면 탈출

        // 1~10까지의 수를 출력하는 프로그램을 do~while문으로 작성하라
        i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while (i<=10);
    }
}
