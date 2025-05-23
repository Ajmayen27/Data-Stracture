package basic;

public interface demo {

    void printThing();
    void AbcPrint();
    default void print(){
        System.out.println("Abc");
    }
}


