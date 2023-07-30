package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로부터 입력 받아서 다른 메서드로 이동해야하는 경우를 생각해보자.
        Scanner s = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = s.nextInt();

        s.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = s.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = s.nextInt();

        s.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = s.nextLine();

        System.out.print("자동차 연식 : ");
        int carYear= s.nextInt();

        s.nextLine();

        System.out.print("자동차 타입 : ");
        String carType = s.nextLine();

//        System.out.println(carName+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        // 클래스로 CarDTO, CarVO 모델을 설계?
//        carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
    }
    // 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하라.
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carName+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
