package com.pratica.livro.comoprogramar.c03.exersices.ex3_13;

import java.util.Scanner;

/**
 *(Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
 * sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
 * método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
 * teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
 * de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
 */
public class EmployeeApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee employee1 = new Employee("Clemilson", "Sousa", 18683.5);
        Employee employee2 = new Employee("Clemilson", "Sousa", 13205.3);
        Employee employee3 = new Employee("Clemilson", "Sousa", -30);

        percentage(employee1);
        percentage(employee2);
        percentage(employee3);

        System.out.printf("%nEnter a percentage: ");
        double percent = input.nextDouble();

        percentage(employee1, percent);
        percentage(employee2, percent);
        percentage(employee3, percent);
    }

    public static void percentage (Employee employee, double percent) {
        employee.setSalary(employee.getSalary() + percent * (employee.getSalary() / 100));
        System.out.printf("%n%s %s - Salary: R$ %.2f", employee.getName(), employee.getLastName(), employee.getSalary());
    }
    public static void percentage (Employee employee) {
        System.out.printf("%s %s - Salary: R$ %.2f%n", employee.getName(), employee.getLastName(), employee.getSalary());
    }
}
