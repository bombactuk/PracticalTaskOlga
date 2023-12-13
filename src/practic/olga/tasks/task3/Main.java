package practic.olga.tasks.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        double x = 0.5;
        int n = 20;

        outputResult(roundingResult(calculatingTheAmountUsingTheFormula(n, x)));

    }

    public static double calculatingTheAmountUsingTheFormula(int n, double x) {

        double result = 0;

        for (int i = 0; i < n; i++) {
            result = ((Math.sin((i * x) / 2)) +
                    Math.sin(((i * x) - 1) / 2)) /
                    Math.exp((x - 1) / i);
            result += result;
        }

        return result * Math.sqrt(n * Math.PI);

    }

    public static BigDecimal roundingResult(double result) {
        BigDecimal rounding = new BigDecimal(result);
        return rounding.setScale(6, RoundingMode.HALF_UP);
    }

    public static void outputResult(BigDecimal result) {
        System.out.println("Результат: " + result);
    }

}

