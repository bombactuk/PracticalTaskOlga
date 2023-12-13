package practic.olga.tasks.task6;

public class Main {
    public static void main(String[] args) {

        double a = 3 * Math.pow(10, 3);
        double b = 6 * Math.pow(10, 4);
        int m = 4;
        int min = -30;
        int max = 60;
        double t1 = Math.sqrt(a + b + m);
        double t2 = m * Math.sqrt(a + b);
        double t3 = Math.sqrt(a * b * m);
        double t4 = m * Math.sqrt(a * b);

        for (double i = min; i < max; i += 4.5) {

            double result = calculationTheResultUsingTheFormula(i);

            if ((result > t1 && result < t2) || (result > t3 && result < t4)) {
                outputResult(result);
            }

        }

    }

    public static double calculationTheResultUsingTheFormula(double i) {
        return Math.pow(i, 3) - (25 * Math.pow(i, 2)) + (50 * i) + 1000;
    }

    public static void outputResult(double result) {
        System.out.println("Результат " + result);
    }

}
