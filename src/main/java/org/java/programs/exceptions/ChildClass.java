package org.java.programs.exceptions;

public class ChildClass extends ParentClass{

    @Override
    public String sayHello() throws RuntimeException {
        return super.sayHello();
    }
}
