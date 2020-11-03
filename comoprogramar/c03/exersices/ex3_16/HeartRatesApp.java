package com.pratica.livro.comoprogramar.c03.exersices.ex3_16;

public class HeartRatesApp {
    public static void main(String[] args) {

        HeartRates person1 = new HeartRates("Clemilson", "Sousa", 2, 4, 1990);
        HeartRates person2 = new HeartRates("Kamila", "Sampaio", 1, 14, 1996);

        dysplayPerson(person1, 2020);
        dysplayPerson(person2, 2020);
    }

    public static void dysplayPerson (HeartRates person, int currentYear) {
        int age = person.age(currentYear);
        int maxHeartRate = person.maxHeartRates(age);
        System.out.printf("%s %s - Born date: %d/%d/%d%n", person.getName(), person.getLastName(),
                person.getMonth(), person.getDay(), person.getYear());
        System.out.printf("Age: %d%n",age);
        System.out.printf("Max heart rate: %d%n", maxHeartRate);
        System.out.printf("Target heart rate: %d%n%n", person.heartRates(maxHeartRate));
    }
}
