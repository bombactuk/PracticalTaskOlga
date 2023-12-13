package practic.olga.tasks.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите x=");
        double x = input.nextDouble();

        outputResult(roundingResult(calculationFormula(x)));

    }

    public static double calculationFormula(double x) {
        return Math.sqrt(Math.exp(2.2 * x)) -
                Math.abs(Math.sin((Math.PI * x) /
                        (x + (double) 2 / 3))) + 1.7;
    }

    public static BigDecimal roundingResult(double result) {
        BigDecimal rounding = new BigDecimal(result);
        return rounding.setScale(6, RoundingMode.HALF_UP);
    }

    public static void outputResult(BigDecimal result) {
        System.out.println("Результат =" + result);
    }

}
