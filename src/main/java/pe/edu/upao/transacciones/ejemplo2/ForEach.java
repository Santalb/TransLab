package pe.edu.upao.transacciones.ejemplo2;


import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println("Lista de Numeros");
        numbers.forEach(it -> {
            System.out.println(it);
        });

    }
}
