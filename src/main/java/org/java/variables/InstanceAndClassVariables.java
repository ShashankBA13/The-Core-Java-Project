package org.java.variables;

public class InstanceAndClassVariables {

    private int instanceVar;
    private static int staticVar;
    private final int finalVariable;

    public InstanceAndClassVariables(int instanceVar, int finalVariable) {
        this.instanceVar = instanceVar;
        this.finalVariable = finalVariable;
    }


    public static void main(String[] args) {
        InstanceAndClassVariables instanceAndClassVariables = new InstanceAndClassVariables(10, 11);
        System.out.println("instanceAndClassVariables.instanceVar = " + instanceAndClassVariables.instanceVar);
        System.out.println("instanceAndClassVariables.finalVariable = " + instanceAndClassVariables.finalVariable);

        InstanceAndClassVariables instanceAndClassVariables1 = new InstanceAndClassVariables(15, 16);
        System.out.println("\ninstanceAndClassVariables1.instanceVar = " + instanceAndClassVariables1.instanceVar);
        System.out.println("instanceAndClassVariables1.finalVariable = " + instanceAndClassVariables1.finalVariable);

        InstanceAndClassVariables.staticVar = 100;
        System.out.println("\nInstanceAndClassVariables.staticVar = " + InstanceAndClassVariables.staticVar);
    }
}
