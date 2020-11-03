package com.pratica.livro.comoprogramar.c17.sc17_6;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubCapitulo17_6 {
    public static void main(String[] args) {
        Employee[] employees = Employee.banco();

        Predicate<Employee> salaryGreaterThan2000 = (e -> e.getSalary() > 1500 && e.getSalary() < 2000);
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;
        Comparator<Employee> lastCompareFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);
        Predicate<Employee> sameLastName = e -> e.getLastName().equals("Sousa");
        ToDoubleFunction<Employee> getSalario = Employee::getSalary;

        List<Employee> listEmployees = Arrays.asList(employees);
        System.out.println("Todos os employees");
        listEmployees.stream().forEach(f -> System.out.println(f));

        System.out.println("----------------------------------------");
        System.out.println("Todos os employees ordenados por nomes");
        Stream.of(employees).sorted(Comparator.comparing(Employee::getFirstName)).forEach(f -> System.out.println(f));

        System.out.println("----------------------------------------");
        System.out.println("Employeess com salários entre 1500 e 2000");
        listEmployees.stream().filter(salaryGreaterThan2000).forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Employeess com salários entre 1500 e 2000 ordenados por salário");
        listEmployees.stream().filter(salaryGreaterThan2000).sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Comparando e ordenande por nome e sobrenome de employee");
        listEmployees.stream().sorted(lastCompareFirst).forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Comparando e ordenande por nome e sobrenome de employee invertido");
        listEmployees.stream().sorted(lastCompareFirst.reversed()).forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Employees com mesmo sobrenome únicos");
        listEmployees.stream().map(Employee::getLastName).distinct().sorted().forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Nomes e sobrenomes dos employees");
        listEmployees.stream().sorted(lastCompareFirst).map(Employee::getName).forEach(System.out::println);

        System.out.println("----------------------------------------");
        System.out.println("Agrupar employees por departamento");
        Map<String, List<Employee>> groupByDepartment = listEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDepartment.forEach((department, employeesPerDepartmente) -> {
            System.out.println(department + " ----------------------------");
            employeesPerDepartmente.forEach(System.out::println);
        });

        System.out.println("----------------------------------------");
        System.out.println("Employees por departamento");
        Map<String, Long> quantityPerDepartmente = listEmployees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        quantityPerDepartmente.forEach((department, quantity) -> {
            System.out.println("Departamento: " + department + " - Employees: " + quantity);
        });

        System.out.println("----------------------------------------");
        System.out.println("Somando todos os salarios");
//        System.out.printf("Soma dos salarios: %.2f\n", listEmployees.stream().mapToDouble(getSalario).sum());
        System.out.printf("Soma dos salarios com reduce: %.2f\n", listEmployees.stream()
                .mapToDouble(getSalario).reduce(0, (v1, v2) -> v1 + v2));

        System.out.println("----------------------------------------");
        System.out.println("Calculando a média dos salários");
        System.out.printf("Média dos salarios: %.2f", listEmployees.stream().mapToDouble(getSalario).average().getAsDouble());
    }
}
