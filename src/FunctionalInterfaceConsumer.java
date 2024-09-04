import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceConsumer {
    static List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

    public static void main(String[] args) throws Exception {
        FunctionalInterfaceConsumer.way1();
    }

    private static void way1() {
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        FunctionalInterfaceConsumer.numeros.forEach(imprimirNumeroPar);
    }

    private static void way2() {

    }

    private static void way3() {

    }
}
