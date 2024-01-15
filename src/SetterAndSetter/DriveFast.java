package SetterAndSetter;

public class DriveFast {
    private final int 고속도로_상수 = 2;
    private final int 에어컨_상수 = 10;

    void 운전(Car car, int time){
        time = 고속도로_상수 * time;
        if(time < 0 || !car.사용가능확인(time))
            throw new IllegalArgumentException();
        car.연료소비(time);
    }

    void 주유(Car car, int fuel){
        if(fuel < 0 || !car.충전가능확인(fuel))
            throw new IllegalArgumentException();
        car.연료주입(fuel);
    }

    void 에어컨작동(Car car, int time){
        if(time < 0 || !car.사용가능확인((고속도로_상수 * time)/에어컨_상수))
            throw new IllegalArgumentException();
        car.연료소비((고속도로_상수 * time)/에어컨_상수);
    }
}
