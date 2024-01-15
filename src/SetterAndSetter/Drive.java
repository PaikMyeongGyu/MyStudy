package SetterAndSetter;

public class Drive {

    private final int 에어컨_상수 = 10;
    void 운전(Car car, int time){
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
        if(time < 0 || !car.사용가능확인(time/에어컨_상수))
            throw new IllegalArgumentException();
        car.연료소비(time/에어컨_상수);
    }
}
