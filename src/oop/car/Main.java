package oop.car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        GasolineCar gasolineCar = new GasolineCar();
        ElectricCar electricCar = new ElectricCar();

        Fuel fuel = new Fuel(100);
        Engine engine = new Engine();
        HybridEngine hybridEngine = new HybridEngine();
        /**
         * 상속으로 인해 gasolineCar에서 정의가 안했지만
         * 부모에 정의된 코드로 작동함.
          */
        gasolineCar.run(fuel, engine);
        gasolineCar.run(fuel, hybridEngine);
        /**
         * 다형성으로 인해 자동차 리스트에는 Car 타입 뿐만 아니라
         * GasolineCar,ElectricCar 또한 담을 수 있음
         */
        cars.add(gasolineCar);
        cars.add(electricCar);
    }

    public static void main2(String[] args) {
        GasolineCar gasolineCar = new GasolineCar();

        Fuel fuel = new Fuel(100);
        HybridEngine hybridEngine = new HybridEngine();
        /**
         * 다형성으로 인해 hybridEngine으로 Engine을 바꾸어도
         * 기존 Car 클래스를 수정할 필요가 없음.
         */
        // gasolineCar.run(fuel, engine);
        gasolineCar.run(fuel, hybridEngine);
    }
}