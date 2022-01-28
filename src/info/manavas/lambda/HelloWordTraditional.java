package info.manavas.lambda;

public class HelloWordTraditional implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWordTraditional helloWordTraditional = new HelloWordTraditional();
        System.out.println(helloWordTraditional.sayHelloWorld());
    }
}
