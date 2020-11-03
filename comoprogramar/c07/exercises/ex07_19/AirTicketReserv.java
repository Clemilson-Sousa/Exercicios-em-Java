package com.pratica.livro.comoprogramar.c07.exercises.ex07_19;

import java.util.Scanner;

public class AirTicketReserv {

    public static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        int reserv;
        int[] seat = new int[11];
        boolean[] seatReserved = new boolean[11];
        int count = 1;

        while (count < seat.length) {
            System.out.println("==== AIR TICKET RESERV ====");
            System.out.printf("Type 1 for FIRST CLASS%n");
            System.out.printf("Type 2 for ECONOMY%n");

            do {
                System.out.print("Select the CLASS: ");
                reserv = INPUT.nextInt();
                if (reserv >= 1 && reserv < seat.length)
                    seat[reserv] = reserv;
                else
                    System.out.println("Please, type 1 for FIRST CLASS or 2 for ECONOMY!");
            } while (!(reserv >= 1 && reserv < seat.length));

            String change;

            if (reserv > 0 && reserv < 6) {
                if (!seatReserved[reserv])
                    seatReserved[reserv] = true;
                else {
                    changeSeat(seat, reserv);
                    change = INPUT.next();
                    if (change.equalsIgnoreCase("s")) {
                        for (int x = 6; x < seat.length; x++) {
                            if (!seatReserved[x]) {
                                seatReserved[x] = true;
                                seat[x] = x;
                                reserv = x;
                                break;
                            }
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours");
                        count--;
                    }
                }
            } else if (reserv > 5 && reserv <= 10) {
                if (!seatReserved[reserv])
                    seatReserved[reserv] = true;
                else {
                    changeSeat(seat, reserv);
                    change = INPUT.next();
                    if (change.equalsIgnoreCase("s"))
                    for (int x = 1; x < seat.length/2; x++) {
                        if (!seatReserved[x]) {
                            seatReserved[x] = true;
                            seat[x] = x;
                            reserv = x;
                            break;
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours");
                        count--;
                    }
                }
            } else
                System.out.println("Pleas try again! (Type: 1-10)");

            if (reserv > 0 && reserv <= 10) {
                printTicket(seat, reserv);
            }
            System.out.printf("---- END OF RESERV ----%n%n");
            count++;
        }
    }

    public static void printTicket(int[] seat, int reserv) {
        System.out.printf("%n------- TICKET --------%n");
        System.out.printf("Seat N°: %d%n", seat[reserv]);
        if (reserv < 5) {
            System.out.printf("Class: FIRST CLASS%n");
        } else
            System.out.printf("Class: ECONOMY%n");
    }

    public static void changeSeat(int[] seat, int reserv) {
        System.out.printf("Seat %d is reserved!%n", seat[reserv]);
        System.out.print("Wish change to FIST CLASS? (S/N):");
    }
}