package Static;

import java.time.LocalDateTime;
import java.util.Locale;

import static java.lang.Thread.sleep;

public class Iphone11 {

    public static final float width = 75.7f;
    public static final float length = 150.9f;
    public static final float height = 9.3f;

    public LocalDateTime manufacturingDate;

    Iphone11(){
        manufacturingDate = LocalDateTime.now();
    }

    public static void whatTimeIsIt(){
        Iphone11 iphone11 = new Iphone11();
        System.out.println(iphone11.manufacturingDate);
    }

    public static void whichOneIsMadeEarly(Iphone11 obj1, Iphone11 obj2){
        if(obj1.manufacturingDate.isBefore(obj2.manufacturingDate))
            System.out.println("left one made early.");
        else
            System.out.println("right one made early.");
    }


    public static void main(String[] args) throws InterruptedException {
        Iphone11 obj1 = new Iphone11();
        sleep(10);
        Iphone11 obj2 = new Iphone11();

        System.out.println(obj1.manufacturingDate);
        System.out.println(obj2.manufacturingDate);

        Iphone11.whichOneIsMadeEarly(obj1, obj2);
    }
}
