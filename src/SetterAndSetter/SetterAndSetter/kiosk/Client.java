package SetterAndSetter.SetterAndSetter.kiosk;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

public class Client {

    private Kiosk kiosk;
    private Scanner scanner = new Scanner(System.in);

    public Client(Kiosk kiosk) {
        this.kiosk = kiosk;
    }

    public void order() {
        kiosk.showFoodList();
        String foodRequest = askUserChoice();
        kiosk.handleOrder(foodRequest);
    }

    private String askUserChoice() {
        return scanner.nextLine();
    }
}
