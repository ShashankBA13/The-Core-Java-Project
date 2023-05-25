package org.java.collections.list;

import org.java.util.ExecutionTime;

import java.util.*;

public class ArrayListEx extends ArrayList<Object> {

    @ExecutionTime
    public static void main(String[] args) {

        ArrayListEx a = new ArrayListEx();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        // A protected method which is only available when u extend the ArrayList
        a.removeRange(1, 3);

        System.out.println(a);

        Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Integer target = 4;

        // Searching in AL using indexOf method
        int index = a.indexOf(target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the list bkhhbk");
        }

        //Iterating over elements
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(target)) {
                System.out.println("Target found at index: " + i);
                break;
            }
        }
//        a.doStuff();
//        ExecutionTimeWrapper.measureExecutionTime(a);
    }

    @ExecutionTime // NOT WORKING
    public  void doStuff(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.getCause();
        }
    }
}