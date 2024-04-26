package designpattern.strategy;

public class Desk {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundolA", 100);
        Item B = new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new LUNACardStrategy("kundol@example.com", "pukubababo"));
        cart.pay(new KAKAOCardStrategy("Ju hongchull", "123456789", "123", "12/01"));
    }
}
