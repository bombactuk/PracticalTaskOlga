package practic.olga.tasks.task2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        double a = 0.5;
        double b = 1;
        double h = (b - a) / 10;

        for (double x = a, count = 1; x <= b; x += h, count++) {
            outputResult(count, roundingNumber(x), roundingNumber(calculationFormula(x)));
        }

    }

    public static double calculationFormula(double x) {
        return Math.sqrt(Math.exp(2.2 * x)) -
                Math.abs(Math.sin((Math.PI * x) /
                        (x + (double) 2 / 3))) + 1.7;
    }

    public static BigDecimal roundingNumber(double number) {
        BigDecimal rounding = new BigDecimal(number);
        return rounding.setScale(6, RoundingMode.HALF_UP);
    }

    public static void outputResult(double count, BigDecimal x, BigDecimal y) {
        System.out.println((int) count + " При x = " + x + " f(у): = " + y);
    }

}
