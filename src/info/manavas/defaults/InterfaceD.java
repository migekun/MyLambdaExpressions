package info.manavas.defaults;

public interface InterfaceD {
    default void sumA(int a, int b) {
        System.out.println("InterfaceA.sumA = " + (a + b));
    }
}
