package oop.solid.lsp;

public class RecfliWallet extends Wallet {

    @Override
    public void payAmount(int amount) {
        if (money - amount < -300) {
            throw new NotEnoughMoneyException();
        }
        money = money - amount;
    }
}
