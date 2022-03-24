package info.manavas.defaults;

public class MultiInheritanceDebuggingExample implements InterfaceA , InterfaceD {

    // Cuando existe conflicto de métodos en Interfaces diferentes que se van a implementar en la clase,
    // la solución pasa por sobreescribir el método que da conflicto en dicha clase
    // aquí InterfaceA i InterfaceD tiene el mismo método sumA, para evitar el conflicto en MultiInheritanceDebuggingExample
    // debemos sobreescribir el método sumA
    public void sumA(int a, int b) {
        System.out.println("MultiInheritanceDebuggingExample.sumA = " + (a + b));
    }

}
