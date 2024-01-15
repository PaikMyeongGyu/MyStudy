package SetterAndSetter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Car {
    private final int MAX_FUEL = 100;
    private final int MIN_FUEL = 0;
    private int fuel;
    private String model;
    public Car(int fuel, String model){
        if(fuel < MIN_FUEL && fuel > MAX_FUEL)
            throw new IllegalArgumentException();
        this.fuel = fuel;
        this.model = model;
    }

    public boolean 사용가능확인(int consume){
        if(fuel - consume < MIN_FUEL)
            return false;
        return true;
    }

    public boolean 충전가능확인(int supply){
        if(fuel + supply > MAX_FUEL)
            return false;
        return true;
    }

    public void 연료주입(int supply){
        fuel = fuel + supply;
    }

    public void 연료소비(int consume){
        fuel = fuel - consume;
    }
}
