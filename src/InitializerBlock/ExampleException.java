package InitializerBlock;

public class ExampleException {

    private static boolean operation;
    private int value;

    static {
        operation = true;
    }

    {
        try{
            if(operation == false)
                throw new Exception();
        } catch(Exception e){
            System.out.println("This instance cannot make");
            throw new IllegalStateException();
        }
    }

    public ExampleException(int value){
        this.value = value;
        System.out.println("Instance is made! It has value : " + value);
    }

    public static void main(String[] args){
        ExampleException ex = new ExampleException(100);
        ExampleException.operation = false;
        ExampleException ex2 = new ExampleException(100000);
    }
}