package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하라.
        Person p = new Person();
        p.name = "홍길동";
        p.age = 1000; // ?
        p.tel = "010-1234-5678";
        System.out.println(p.name+"\t"+p.age+"\t"+p.tel);
    }
}
