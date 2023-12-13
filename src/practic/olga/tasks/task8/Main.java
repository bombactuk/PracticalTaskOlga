package practic.olga.tasks.task8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        double x = 0.1;
        int counter = 0;

        while (calculationsUsingTheFormula(x) > calculationsUsingTheFormula(x + 0.1) && (x <= 10)) {

            x += 0.1;

            if (x < 10) {

                counter++;

                outputResult(counter, roundingNumber(x), roundingNumber(calculationsUsingTheFormula(x)));

            }

        }

    }

    public static double calculationsUsingTheFormula(double x) {
        return Math.pow(x, 2) - Math.exp(2 * x) + 4;
    }

    public static BigDecimal roundingNumber(double number) {
        BigDecimal rounding = new BigDecimal(number);
        return rounding.setScale(6, RoundingMode.HALF_UP);
    }

    public static void outputResult(int counter, BigDecimal x, BigDecimal y) {
        System.out.println(counter + " X=" + x + " Y=" + y);
    }

}
