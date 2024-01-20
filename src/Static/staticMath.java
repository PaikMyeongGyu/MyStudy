package Static;

import java.util.List;

public class staticMath {

    public static int max(List<Integer> integers){
        int maxValue = Integer.MIN_VALUE;
        for(Integer integer: integers){
            if(maxValue < integer)
                maxValue = integer;
        }
        return maxValue;
    }
}
