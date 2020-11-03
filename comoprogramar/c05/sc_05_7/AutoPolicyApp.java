package com.pratica.livro.comoprogramar.c05.sc_05_7;

public class AutoPolicyApp {
    public static void main(String[] args) {

        AutoPolicy policy1 = new AutoPolicy(1111, "Camaro", "PA");
        policyInNoFaultSate(policy1);
    }

    public static void policyInNoFaultSate(AutoPolicy policy) {
        System.out.println("The auto policy: ");
        System.out.printf("Account: %d%nCar: %s%nState: %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));

    }
}
