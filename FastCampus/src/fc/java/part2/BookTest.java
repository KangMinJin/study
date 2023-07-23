package fc.java.part2;

public class BookTest {
    public static void main(String[] args) {
        // 정수 한 개를 저장할 변수를 선언하라
        int a;
        // 6개의 변수로 한 권의 책 데이러를 저장하고 출력하라
        String title = "자바";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbn = "ISBN-111990011";
        System.out.println(title+"\t"+price+"\t"+company+"\t"+author+"\t"+page+"\t"+isbn);

        // 책 한 권을 저장할 변수를 선언하라
        Book b = new Book(); // 변수 선언과 객체 생성 및 연결
        // . Dot(도트연산자) = 참조연산자
        b.title = "자바";
        b.price = 30000;
        b.company = "FastCampus";
        b.author = "패스트캠퍼스";
        b.page = 715;
        b.isbn = "ISBN-202307151";

        System.out.println(b);
    }
}
