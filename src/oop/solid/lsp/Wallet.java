package oop.solid.lsp;

public abstract class Wallet {
    int money;

    public int getMoney() {
        return money;
    }

    public void payAmount(int amount) {
        if (money < amount)
            throw new NotEnoughMoneyException();
        money = money - amount;
    }
}
