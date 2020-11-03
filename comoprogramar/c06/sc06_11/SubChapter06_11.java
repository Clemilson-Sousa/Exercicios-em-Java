package com.pratica.livro.comoprogramar.c06.sc06_11;

public class SubChapter06_11 {

    private int fiedlVariable = 1;
    private static int fiedlVariableStatic = 1;
    private int variableStatic = SubChapter06_11.fiedlVariableStatic;

    public static void main(String[] args) {

        SubChapter06_11 instanceVariable = new SubChapter06_11();

        int localVariableMain = 1;

        instanceVariable.sumAllValuesNoStatic();
        sumOutStatic(localVariableMain);
    }

    private void sumAllValuesNoStatic() {
        int methodVariable = 1;
        int fiedlVariable = 1;
        System.out.println("Sum of all values: " + (methodVariable + fiedlVariable + this.fiedlVariable + variableStatic));
    }

    private static void sumOutStatic(int parameter) {
        int methodVariable = 1;
        System.out.println("Value of sumOutStatic: " + (methodVariable + parameter + fiedlVariableStatic));
    }
}
