package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // 생성자 메서드를 통해서 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하라.
        PersonVO p = new PersonVO();
        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getTel());

        PersonVO p1 = new PersonVO();
        System.out.println(p1.getName()+"\t"+p1.getAge()+"\t"+p1.getTel()); // 결과는 위와 같다.

        // 개발자가 원하는 값으로 초기화를 하는 방법
    }
}
