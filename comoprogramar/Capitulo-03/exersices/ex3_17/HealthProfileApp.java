package com.pratica.livro.comoprogramar.c03.exersices.ex3_17;

/**
 * (Computadorização dos registros de saúde) Uma questão relacionada à assistência médica discutida ultimamente nos veículos de
 * comunicação é a computadorização dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações quanto à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
 * posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre
 * vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe HealthProfile “inicial” para uma
 * pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia
 * e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.
 * Para cada atributo, forneça métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos,
 * intervalo de frequência cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
 * o Exercício 2.33). Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
 * ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e
 * então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
 * o gráfico de valores IMC do Exercício 2.33.
 */
public class HealthProfileApp {
    public static void main(String[] args) {

        HealthProfile person1 = new HealthProfile("Clemilson", "Sousa", "Male",
                2, 4, 1990, 65, 1.7);

        profile(person1, 2020);

    }

    public static void profile (HealthProfile profile, int currentYear) {
        int age = profile.getAge(currentYear);
        int maxRate = profile.maxHealtRate(age);
        System.out.printf("Name: %s %s%n", profile.getName(), profile.getLastName());
        System.out.printf("Gender: %s%n", profile.getGender());
        System.out.printf("Born date: %d/%d/%d%n", profile.getMonth(), profile.getDay(), profile.getYear());
        System.out.printf("Age: %d years old%n", age);
        System.out.printf("Weight: %.2f kg%n", profile.getWeight());
        System.out.printf("Weight: %.2f m%n", profile.getHeight());
        System.out.printf("Max healt rate: %d%n", maxRate);
        System.out.printf("Healt rate: %d%n", profile.healtRate(maxRate));
        System.out.printf("Body mass indice: %.2f%n", profile.bmi());

    }
}
