package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한 사람의 회원 정보를 저장할 객체를 생성하라.
        PersonVO p = new PersonVO();

        p.setName("홍길동");
        p.setAge(30);
        p.setTel("010-1111-1111");
//        p.name = "홍길동";
//        p.age = 3000; // 정보 은닉 되지 않음
//        p.tel ="010-1234-5678";

        System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getTel());
//        System.out.println(p.name+"\t"+p.age+"\t"+p.tel);
    }
}
