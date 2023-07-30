package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVo객체에 원하는 이름, 나이, 전화번호를 저장하고 toString()메서드로 출력하라.
        PersonVO p = new PersonVO("홍길동", 34, "010-1111-1111");
        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getTel());
        System.out.println(p.toString());
        System.out.println(p); // p만 입력해도 p.toString()를 찾아서 출력 가능하게 해준다!
    }
}
