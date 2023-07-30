package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생성하라
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        // 학생 객체를 설계하고 데이터를 저장 한 후 출력하라.
        Student s = new Student("홍길동", "컴퓨터공학과", 37, "qwe@qweqwe.com", 20231010, "010-1111-1111");
        System.out.println(s.toString());
    }
}
