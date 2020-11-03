package com.pratica.livro.comoprogramar.c04.exercises.ex04_20;

import java.util.Scanner;

/**
 * (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
 * as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
 * horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
 * programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
 * Utilize a classe Scanner para inserir os dados.
 *
 * inicializa nomeEmpregdo = ""
 * inicializa horasTrabalhadas = 0
 * inicializa salarioHora = 0
 * inicializa salario = 0
 * inicializa salarioTotal = 0
 * inicializa horaExtra = 0
 * inicializa contador = 1
 *
 * enquanto contador for menor ou igual a 3 faça
 * 	leia nomeEmpregado
 * 	leia horasTrabalhadas
 * 	leia salarioHora
 *
 * 	se horasTrabalhadas for maior que 40 faca
 * 		horaExtra = horasTrabalhadas - 40
 *
 * 	salario = horasTrabalhadas * salarioHora
 *
 * 	horaExtra *= 1.5
 *
 * 	salarioTotal = salario + horaExtra
 *
 * 	exibir nomeEmpregado
 * 	exibir salarioBruto
 *
 * 	contador++
 */
public class Employee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String employeeName;
        int workedHours;
        double hourSalary;
        int counter = 1;

        while (counter <= 3) {
            System.out.print("Enter employee name: ");
            employeeName = input.next();
            System.out.print("Enter worked hours: ");
            workedHours = input.nextInt();
            System.out.print("Enter hour salary: ");
            hourSalary = input.nextDouble();

            int extraHour = 0;
            if (workedHours > 40) {
                extraHour = workedHours - 40;
            }
            extraHour *= 1.5;
            double bruteSalary = extraHour + (workedHours * hourSalary);
            System.out.printf("%nEmployee name: %s%n", employeeName);
            System.out.printf("Employee name: %.2f%n", bruteSalary);
            System.out.println();
            counter++;
        }
    }
}
