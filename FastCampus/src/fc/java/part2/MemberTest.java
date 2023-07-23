package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        // 한 명의 헬스클럽 회원 데이터를 저장하고 출력하시오
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.tel = "010-1111-1111";
        m.email = "fc@fastcampus.com";
        m.addr = "서울";
        m.weight = 65.5f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.addr+"\t"+m.weight);
    }
}
