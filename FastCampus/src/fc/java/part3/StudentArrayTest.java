package fc.java.part3;

import fc.java.model.PersonVO;
import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // 객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요
        Student[] s = new Student[4];
        s[0] = new Student("홍길동", "컴공", 37, "qwe@qweqwe.com", 20231010, "010-1111-1111");
        s[1] = new Student("나길동", "전기", 43, "qwe@qweqwe.com", 20231010, "010-1111-1111");
        s[2] = new Student("김길동", "건축", 25, "qwe@qweqwe.com", 20231010, "010-1111-1111");
        s[3] = new Student("이길동", "통신", 51, "qwe@qweqwe.com", 20231010, "010-1111-1111");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i].toString());
        }
        System.out.println();
        for (Student st : s) {
            System.out.println(st.toString());
        }
    }
}
