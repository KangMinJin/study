package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하라
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].title="엘리멘탈";
        m[0].release="2023-06-14";
        m[0].running=109;
        m[0].hero="엠버";
        m[0].age=0;
        m[0].genre="애니메이션";

        m[1] = new Movie();
        m[1].title="범죄도시3";
        m[1].release="2023-05-31";
        m[1].running=105;
        m[1].hero="마석도";
        m[1].age=15;
        m[1].genre="액션";

        m[2] = new Movie();
        m[2].title="C영화";
        m[2].release="2023-07-22";
        m[2].running=173;
        m[2].hero="홍길동";
        m[2].age=12;
        m[2].genre="코믹";

        // 반복문
        for (int i = 0; i < m.length ; i++) {
            System.out.println(m[i].title+"\t"+m[i].release+"\t"+m[i].running+"\t"+m[i].hero+"\t"+m[i].age+"\t"+m[i].genre);
        }
    }
}
