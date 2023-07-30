package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 생성자 메서드를 통해서 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하라.
        PersonVO p = new PersonVO("홍길동", 34, "010-5555-5555");
        PersonVO p1 = new PersonVO("나길동", 60, "010-2222-2222");
        PersonVO p2 = new PersonVO("하길동", 50, "010-3333-3333");

        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getTel());
        System.out.println(p1.getName()+"\t"+p1.getAge()+"\t"+p1.getTel());
        System.out.println(p2.getName()+"\t"+p2.getAge()+"\t"+p2.getTel());
    }
}
