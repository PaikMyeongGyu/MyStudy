package EqualsAndHashCode;

public class Equality {
    public static void main(String[] args){
        // Temp tempA = new Temp("ObjectA");
        // Temp tempB = new Temp("ObjectB");
        // Temp copyA = tempA;
        //
        // System.out.println("tempA == tempB: " + (tempA == tempB));
        // System.out.println("tempA == tempA: " + (tempA == tempA));
        // System.out.println("tempA == copyA: " + (tempA == copyA));
        //
        // System.out.println("tempA.eqauls(tempA): " + (tempA.equals(tempA)));
        // System.out.println("tempA.eqauls(copyA): " + (tempA.equals(copyA)));
        // System.out.println("tempA.equals(tempB): " + (tempA.equals(tempB)));

        String A = new String("hello");
        String B = new String("hello");
        System.out.println("A == B: " + (A == B));
        System.out.println("A.equals(B): " + (A.equals(B)));

        String C = "hello";
        String D = "hello";
        System.out.println("C == D: " + (C == D));
        System.out.println("C.equals(D): " + (C.equals(D)));
    }


    static class Temp {
        String name;
        Temp(String name){this.name = name;}
    }
}
