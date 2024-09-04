import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Class to make tests related to the functional interface consumer
 */
public class FunctionalInterfaceConsumer {
    /**
     * Numbers to be iterated
     */
    static List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

    /**
     * Main method, to execute manual tests
     * @param args CLI args (ignored)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FunctionalInterfaceConsumer.way1();
        System.out.println("-----------");
        FunctionalInterfaceConsumer.way2();
        System.out.println("-----------");
        FunctionalInterfaceConsumer.way3();
    }

    /**
     * One way to use the functional interface consumer
     */
    private static void way1() {
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        FunctionalInterfaceConsumer.numeros.forEach(imprimirNumeroPar);
    }

    /**
     * Another way to use the functional interface consumer
     */
    private static void way2() {
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // see the stream() after numeros. Equals to way1 in all ohter parts
        FunctionalInterfaceConsumer.numeros.stream().forEach(imprimirNumeroPar);
    }

    /**
     * Another way to use the functional interface consumer
     */
    private static void way3() {
        FunctionalInterfaceConsumer.numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });
    }
}
