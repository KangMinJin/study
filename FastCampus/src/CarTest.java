public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장하려고 한다. 변수를 만들어 보시오
        String model = "BMW528i"; // 문자열은 "" 로 감싼다.
        System.out.println("model = " + model);
        long distance = 10000000000L; // long은 뒤에 L을 붙여야 long으로 인식한다.(기본형이 int)
        System.out.println("distance = " + distance + "km");
        int price = 9000000;
        System.out.println("price = " +price+"원");
        char type = 'A'; // 문자는 ''로 감싼다.
        System.out.println("type = " +type+"Type");
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi = 12.5f; // float는 뒤에 f를 붙여야 float로 인식한다.(기본형이 double)
        System.out.println("gasmi = " +gasmi+"l");
    }
}
