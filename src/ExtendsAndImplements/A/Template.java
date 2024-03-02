package ExtendsAndImplements.A;

public abstract class Template<T> {

    public T execute(){
        System.out.println("================");
        T result = logic();
        System.out.println("================");
        return result;
    }

    abstract T logic();
}
