package practic.olga.tasks.task5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double a = 1;
        double dx = a / 5;
        double x = -2 * a;

        System.out.println("Введите количество знчений n=");
        int n = input.nextInt();

        for (int i = 0, count = 1; i < n; i++, count++) {

            outputResult(count, roundingNumber(x), roundingNumber(calculationFormula(x, a)));

            x += dx;

        }

    }

    public static double calculationFormula(double x, double a) {
        if (x <= 0) {
            return a / 2 * (Math.exp(x / a) + (Math.exp(-x / a)));
        } else {
            return 4 * Math.pow(a, 3) / (Math.pow(x, 2) + 4 * Math.pow(a, 2));
        }
    }

    public static BigDecimal roundingNumber(double number) {
        BigDecimal rounding = new BigDecimal(number);
        return rounding.setScale(6, RoundingMode.HALF_UP);
    }

    public static void outputResult(int count, BigDecimal x, BigDecimal y) {
        System.out.println(count + " x=" + x + " y=" + y);
    }

}
