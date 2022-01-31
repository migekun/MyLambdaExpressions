package info.manavas.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello world";
        };
        HelloWorldInterface helloWorldInterfaceSimple = () ->  "Hello world";

        System.out.println("helloWorldInterface.sayHelloWorld() = " + helloWorldInterface.sayHelloWorld());
        System.out.println("helloWorldInterfaceSimple.sayHelloWorld() = " + helloWorldInterfaceSimple.sayHelloWorld());

    }
}
