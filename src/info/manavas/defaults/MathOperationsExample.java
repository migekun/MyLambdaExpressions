package info.manavas.defaults;

public class MathOperationsExample implements Calculator {
    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println("mathOperationsExample.sum() = " + mathOperationsExample.sum(2, 4));
//        System.out.println("mathOperationsExample.divide() = " + mathOperationsExample.divide(4, 2));

        //our implementations using Lambda expressions for sum and divide
        Calculator calculator = (num1, num2) -> num1 % num2;
        //para poder usar una expresion lambda en la interface funcional solo puede existir un método a implementar,
        //pero varios default o static methods
        System.out.println("Calculator override using lambda = " + calculator.sum(3,6));
        System.out.println("Subtract: " + mathOperationsExample.subtract(4, 2));
        System.out.println("Calculator.multiply(4, 2) = " + Calculator.multiply(4, 2));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

// Para usar lambda en interface solo puede existir un método a implementar, eligo eliminar divide
//    @Override
//    public int divide(int num1, int num2) {
//        return num1 / num2;
//    }
}
