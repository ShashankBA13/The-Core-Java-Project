package org.java.singleton;

public class DCLSingleton {

    // DCL - Double-Checked Locking

    /**
     * A static volatile field is used to hold the instance of the Singleton class.
     * Without volatile, it won't be thread safe bcoz it provides the happens-before
     * guarantee
     */
    private static volatile DCLSingleton _instance = null;

    private DCLSingleton() {
    }

    public static DCLSingleton instance() {
        if (_instance == null) { // 1st Check
            synchronized (DCLSingleton.class) {
                if (_instance == null) { // 2nd Check
                    _instance = new DCLSingleton();
                }
            }
        }
        return _instance;
    }
}