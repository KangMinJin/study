package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String tel;
    // 생략된 생성자 메서드가 있다 => 기본 생성자(default Constructor)
    public PersonVO(){
        // 객체를 생성하는 코드는 내부에서 만들어진다.
        // 객체의 초기화를 한다.
//        this.name = "홍길동"; // this. 생략 가능
//        this.age = 50;
//        this.tel = "010-1111-1111";
    }
    // 생성자의 overloading
    public PersonVO(String name, int age, String tel){
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    // Getter Method
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getTel(){
        return this.tel;
    }
    public String toString(){
        return name+"\t"+age+"\t"+tel;
    }
}
