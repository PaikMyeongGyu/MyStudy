package SetterAndSetter.SetterAndSetter.multiget;

public class Paperboy {
    Customer currentCustomer = null;

    // 문제가 잘 보이지 않는 코드
    public void payDeliveryFee(Customer customer, int deliveryFee) {
        currentCustomer = customer;

        Wallet wallet = customer.getWallet();
        if (wallet.getMoney() >= deliveryFee) {
            System.out.println("배송 비용 지불이 완료되었습니다.");
        } else {
            throw new IllegalArgumentException();
        }
    }

    // 문제가 잘 보이는 코드
    public void payDeliveryFee2(Customer customer, int deliveryFee) {
        currentCustomer = customer;

        if (customer.getWallet().getMoney() >= deliveryFee) {
            System.out.println("배송 비용 지불이 완료되었습니다.");
        } else {
            throw new IllegalArgumentException();
        }
    }
}
