package info.manavas.funcprogramming;

import java.util.List;
import java.util.function.IntConsumer;

public class VariableScopeExample {
    //static int k = 0;
    // Si la declaras aquí se puede usar y modificar en cualquier parte del código

    public static void main(String[] args) {
        int b = 10; //Local var
        IntConsumer intConsumer = (a) -> System.out.println(a * b);

        List<Instructor> instructors = Instructors.getAll();
        int k = 0; // si la declaras aqui la puedes usar dentro del consumer, pero no puedes modificarlo
        instructors.forEach(instructor -> {
            System.out.println(instructor + " " + k);
        });
       // k++;
        // da error con la variable usada en el cosumer y declarada dentro del método
        // no da error si la variable es global y se declara en la clase como static
        // usando dentro del consumer y modificando despues del consumer
    }
}
