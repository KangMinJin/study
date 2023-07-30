package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student s1; // s1 : Object
        Student s2; // s2 : Object
        Student s3; // s3 : Object

        s1 = new Student("홍길동","컴공", 37, "qweqwe@qwe.qwe", 20231010, "010-1111-1111"); // s1 : Instance
        s2 = new Student("김길동","컴공", 37, "qweqwe@qwe.qwe", 20231010, "010-1111-1111"); // s2 : Instance
        s3 = new Student("이길동","컴공", 37, "qweqwe@qwe.qwe", 20231010, "010-1111-1111"); // s3 : Instance

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
