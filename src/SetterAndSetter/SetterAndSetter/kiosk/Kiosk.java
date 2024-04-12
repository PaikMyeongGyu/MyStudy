package SetterAndSetter.SetterAndSetter.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Kiosk {

    private List<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void showFoodList() {
        for (Food food : foods) {
            System.out.println(food.getName());
        }
    }

    public void handleOrder(String foodRequest) {
        Optional<Food> orderedFood = foods.stream().filter(food ->
                food.getName().equals(foodRequest)).findFirst();

        if(orderedFood.isPresent()) {
            Food findFood = orderedFood.get();
            System.out.println("요청하신 " + findFood.getName() + "에 대한 주문이 완료되었습니다.");
            System.out.println("요청하신 주문의 예상 시간은 " + findFood.getEstimatedTime() + "입니다.");
        }
        else
            System.out.println("요청하신 주문이 존재하지 않습니다.");
    }
}
