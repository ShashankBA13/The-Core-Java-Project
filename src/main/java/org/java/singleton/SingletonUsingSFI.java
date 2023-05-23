package org.java.singleton;

public class SingletonUsingSFI {

    private static final SingletonUsingSFI INSTANCE = new SingletonUsingSFI();

    private SingletonUsingSFI() {}

    public static SingletonUsingSFI getInstance() {
        return INSTANCE;
    }

    public void show(){
        System.out.println("SingletonUsingSFI using static field initialization");
    }
}


//To access the method
// SingletonUsingSFI.getInstance().show();