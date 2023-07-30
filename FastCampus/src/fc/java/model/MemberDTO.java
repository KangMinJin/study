package fc.java.model;

public class MemberDTO {
    public String name;
    private int age; // 정보 은닉
    public String tel;
    public void play(){ // 메소드는 상호작용을 위해서 보통 public
        System.out.println("운동을 한다.");
    }
}
