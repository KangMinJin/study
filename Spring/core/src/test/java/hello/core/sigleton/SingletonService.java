package hello.core.sigleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { // private 생성자로 외부에서 new 사용하지 못하게 막기
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
