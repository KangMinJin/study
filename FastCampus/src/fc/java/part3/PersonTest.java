package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // 한 사람의 데이터를 저장할 변수를 선언하라
        // 모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성하라
        //  인스턴스를 만드는 과정
        Person p = new Person();
        
        p.name = "홍길동";
        p.age = 30;
        p.tel = "010-1234-5678";

        System.out.println(p.name+"\t"+p.age+"\t"+p.tel);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();

        p1.name = "나길동";
        p1.age = 30;
        p1.tel = "010-1234-5678";

        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.tel);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
