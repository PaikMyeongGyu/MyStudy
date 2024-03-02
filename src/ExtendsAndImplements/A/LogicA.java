package ExtendsAndImplements.A;

public class LogicA extends Template{

    @Override
    String logic() {
        System.out.println("I'm logicA!");
        return null;
    }

    public static void main(String args[]){
        Template template = new Template() {
            @Override
            String logic() {
                System.out.println("I'm inner class");
                return null;
            }
        };

        template.execute();
    }
}
