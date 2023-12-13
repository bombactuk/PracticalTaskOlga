package practic.olga.tasks.task7;

public class Main {
    public static void main(String[] args) {

        double x = 0.1;
        double z = 0.2;
        double h = 0.5;
        int n = 10;
        int m = 5;
        int check = 0;

        for (int i = 0; i < n; i++) {

            outputResult(x, z, calculationsUsingTheFormula(x, z));

            x = x * h;

            if (check < m) {
                z = z * (h / 0.55);
                check++;
            }

        }

    }

    public static double calculationsUsingTheFormula(double x, double z) {
        return Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) +
                Math.abs(Math.log(z)) + (Math.log(x) /
                Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));
    }

    public static void outputResult(double x, double z, double result) {
        System.out.println("При x=" + x + " z=" + z + " Функция=" + result);
    }

}
