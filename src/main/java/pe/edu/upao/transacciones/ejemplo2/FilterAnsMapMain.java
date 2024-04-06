package pe.edu.upao.transacciones.ejemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAnsMapMain {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1,2,3,4,5);

            List<Integer> paresCuadrado = new ArrayList<>(numbers);
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    paresCuadrado.add(number + number);
                }
            }

            paresCuadrado.forEach(System.out::println);

            System.out.println("Pares Cuadrado con Funciones/landas/closures");
            List<Integer> paresCuadrado2 = numbers.stream()
                    .filter(element -> element % 2 == 0)
                    .map(element -> element * element)
                    .toList();

            paresCuadrado2.forEach(System.out::println);

            System.out.println("Divisible entre 4");
            if (numbers.stream().anyMatch(it -> it % 4 == 0)){
                System.out.println("Hay numero divisible entre 4");
            }

            System.out.println("El primer numero es " + numbers.stream().findFirst().orElse(0));


        }

}
