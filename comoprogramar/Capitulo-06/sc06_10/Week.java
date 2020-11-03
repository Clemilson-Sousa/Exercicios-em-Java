package com.pratica.livro.comoprogramar.c06.sc06_10;

import java.util.Scanner;

public class Week {

    private enum Status {OPEN, CLOSED}

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Status weekStatus = Status.OPEN;

        while (weekStatus == Status.OPEN) {

            int day = weekDayInformer();

            switch (day) {
                case MONDAY:
                    System.out.println("Today is Monday!");
                    weekStatus = Status.CLOSED;
                    break;
                case TUESDAY:
                    System.out.println("Today is Tuesday!");
                    weekStatus = Status.CLOSED;
                    break;
                case WEDNESDAY:
                    System.out.println("Today is Wednesday!");
                    weekStatus = Status.CLOSED;
                    break;
                case THURSDAY:
                    System.out.println("Today is Thursday!");
                    weekStatus = Status.CLOSED;
                    break;
                case FRIDAY:
                    System.out.println("Today is Friday!");
                    weekStatus = Status.CLOSED;
                    break;
                case SATURDAY:
                    System.out.println("Today is Saturday!");
                    weekStatus = Status.CLOSED;
                    break;
                case SUNDAY:
                    System.out.println("Today is Sunday!");
                    weekStatus = Status.CLOSED;
                    break;
                default:
                    System.out.println("Invalid day of week!");
            }
        }
    }

    public static int weekDayInformer() {
        System.out.print("Insert day of week: ");
        return input.nextInt();
    }
}
