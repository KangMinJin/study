package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // setter, getter 메소드를 통해 PersonVO 객체에 이름, 나이, 전화번호를 저장하고 출력하라.
        PersonVO p = new PersonVO();
        p.setName("홍길동");
        p.setAge(50);
        p.setTel("010-1111-1111");
        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getTel());
    }
}
