package practic.olga.tasks.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final Scanner input = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Введите количество точек=");
        int amountOfPoints = input.nextInt();

        displayingTheNumberOfHitPoints(calculationOfWhetherPointFallsIntoGivenArea(amountOfPoints));

    }

    public static int calculationOfWhetherPointFallsIntoGivenArea(int amountOfPoints) {

        int counter = 0;

        for (int i = 0; i < amountOfPoints; i++) {

            int pointX = creatingRandomPoint();
            int pointY = creatingRandomPoint();

            if (((pointX >= -2 && pointX <= 0) &&
                    (pointY <= 2 && pointY >= 0)) ||
                    ((pointX <= 2 && pointX >= 0) &&
                            (pointY >= -1 && pointY <= 1))) {
                counter++;
                outputHitPoint(true, pointX, pointY);
            } else {
                outputHitPoint(false, pointX, pointY);
            }

        }

        return counter;

    }

    public static int creatingRandomPoint() {
        return random.nextInt(21) - 10;
    }

    public static void displayingTheNumberOfHitPoints(int counter) {
        System.out.println("Количество точек попавшие в заданную область = " + counter);
    }

    public static void outputHitPoint(boolean hit, int pointX, int pointY) {
        if (hit) {
            System.out.println("Точка [" + pointX + "," + pointY + "] попадает в заданную область");
        } else {
            System.out.println("Точка [" + pointX + "," + pointY + "] не попадает в заданную область");
        }
    }

}
