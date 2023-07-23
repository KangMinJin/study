package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타 : 물의 길";
        m.release = "2022.12.24";
        m.hero = "제이크 설리";
        m.genre = "액션";
        m.running = 192;
        m.age = 12;
        System.out.println(m.title+"\t"+m.release+"\t"+m.hero+"\t"+m.genre+"\t"+m.running+"분\t"+m.age+"세");
    }
}
