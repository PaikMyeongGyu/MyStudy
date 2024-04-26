package designpattern.factory;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.LATTE);
        System.out.println(coffee.getName()); // latte
    }
}
