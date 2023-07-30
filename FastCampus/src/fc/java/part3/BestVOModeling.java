package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        // 잘 설계된 영화 객체를 설계하고 데이터를 저장 한 후 출력하라.
        MovieVO m = new MovieVO("아바타", "2022-12-14", "제이크 설리", "액션", 192, 12);
        System.out.println(m.toString());
        System.out.println(m.getLevel());
    }
}
