package oop.chapter1;

import java.awt.*;

public class Application2 {
    private Menu menu1 = new Menu("menu1");
    private Menu menu2 = new Menu("menu2");
    private Button button1 = new Button("button1");


    private ScreenUI currentScreen = null;

    public Application2(Menu menu1, Menu menu2, Button button1) {
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.button1 = button1;
    }

//    public void clicked(Component eventSource) {
//        String sourceId = eventSource.getId();
//        if (eventSource.equals("menu1")) {
//            currentScreen = new Menu1ScreenUI();
//            currentScreen.show();
//        } else if (eventSource.equals("menu2")) {
//            currentScreen = new Menu2ScreenUI();
//            currentScreen.show();
//        } else if (eventSource.equals("button1")) {
//            if (currentScreen == null)
//                return;
//            currentScreen.handleButton1Click();
//        }
//    }
}
