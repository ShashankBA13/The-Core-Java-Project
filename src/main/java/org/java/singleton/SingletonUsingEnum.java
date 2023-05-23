package org.java.singleton;

public enum SingletonUsingEnum {
    INSTANCE;

    public void show(){
        System.out.println("Singleton Using Enum");
    }
}

// To access the method
// SingletonUsingEnum.INSTANCE.show();