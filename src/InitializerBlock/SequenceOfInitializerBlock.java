package InitializerBlock;
public class SequenceOfInitializerBlock {

    static {
        System.out.println("hello static initializer block");
    }

    {
        System.out.println("hello initializer block");
    }

    SequenceOfInitializerBlock(){
        System.out.println("hello constructor");
    }

    private void hello(){
        System.out.println("hello hello method");
    }

    public static void main(String args[]){
        // 결과는 다음과 같다.
        // hello static initializer block
        // hello initializer block
        // hello constructor
        // hello hello method
        SequenceOfInitializerBlock si = new SequenceOfInitializerBlock();
        si.hello();
    }
}