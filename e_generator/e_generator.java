/**
 * e_generator.java
 */
public class e_generator {

    public static void main(String[] args) {

        double euler = 1.0;
        double fact = 1.0;
        int iterations = 17; //higher iteration count doesn't improve result

        System.out.print("Approximation of Euler's number: ");

        for (long i = 1; i <= iterations; i++) {

            for (long n = 1; n <= i; n++) {
                fact = fact / n;
            }

            euler = euler + fact;
            fact = 1.0;
        }
        System.out.println(euler);
    }
}