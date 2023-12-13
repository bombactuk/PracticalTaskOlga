package practic.olga.tasks.task6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        double a = 3 * Math.pow(10, 3);
        double b = 6 * Math.pow(10, 4);
        int m = 4;
        int min = -30;
        int max = 60;

        calculationFormulaAndConclusion(min, max, a, b, m);

    }

    public static void calculationFormulaAndConclusion(int min, int max, double a, double b, int m) {

        double t1 = Math.sqrt(a + b + m);
        double t2 = m * Math.sqrt(a + b);
        double t3 = Math.sqrt(a * b * m);
        double t4 = m * Math.sqrt(a * b);

        for (double i = min; i < max; i += 4.5) {

          double result = Math.pow(i, 3) - (25 * Math.pow(i, 2)) + (50 * i) + 1000;

            if ((result > t1 && result < t2) || (result > t3 && result < t4)) {
                outputResult(result);
            }

        }

    }

    public static void outputResult(double result) {
        System.out.println("Результат " + result);
    }

}
