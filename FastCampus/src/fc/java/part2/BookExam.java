package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        // 정수 1개를 저장할 변수를 선언하라.
        int a;
        a = 10;

        // 책 1권을 저장할 변수를 선언하라.
//        fc.java.part2.Book b;
//        b = new fc.java.part2.Book();

        // 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오.(인스턴스를 만드시오)
        Book b = new Book();
        b.title = "Java";
        b.price = 32000;
        b.company = "Fast_campus";
        b.author = "저자";
        b.page = 890;
        b.isbn = "ISBN-123456789";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn);
    }
}
