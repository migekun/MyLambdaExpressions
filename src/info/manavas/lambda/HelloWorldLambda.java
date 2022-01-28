package info.manavas.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> {
            return "Hello world";
        };
        System.out.println("helloWorldInterface.sayHelloWorld() = " + helloWorldInterface.sayHelloWorld());
    }
}
