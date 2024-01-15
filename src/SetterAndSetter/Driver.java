package SetterAndSetter;

public class Driver {
    static Drive drive = new Drive();

    public static void main(String[] args){
        Car car1 = new Car(100,"K5");
        Car car2 = new Car(100, "K7");

        drive.운전(car1, 1000);
        drive.운전(car2, 1000);
    }
}
