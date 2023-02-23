import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{2234, 22, 3445};
        Method(ints);
        System.out.println();


    }

    public static <U> void Method(U[] array) {
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println(Arrays.toString(array));




    }
}