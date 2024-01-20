package InitializerBlock;

import java.util.Date;

public class ExampleStaticInitializerUseInstance {

    public static long value;

    static{
        Date date = new Date();
        value = date.getTime();
    }
}
