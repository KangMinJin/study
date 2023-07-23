// 두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE 프로그램을 만들어보자.
// 국어 77점, 영어 87점. 변수는 각각 kor, eng
public class Operator {
    public static void main(String[] args) {
        int kor, eng, sum, avg;
        kor = 77;
        eng = 87;
        sum = kor + eng;
        avg = sum / 2;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
