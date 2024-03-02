package ExtendsAndImplements.A;

public class Apple extends Fruit {

    @Override
    public void printName(){
        name = "apple";
        System.out.println("this is a "+ name + "apple method!");
    }

    public void makeJuice(){
        System.out.println("Make Apple Juice");
    }
}
