package org.java.collections.map;

import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Key, Value> map = new WeakHashMap<>();

        Key key1 = new Key(1);
        Value value1 = new Value("Some Value");

        Key key2 = new Key(2);
        Value value2 = new Value("Some different Value");

        Key key3 = new Key(1);
        Value value3 = new Value("Some another Value");

        map.put(key1, value1);
        map.put(key2, value2);
        map.put(key3, value3);

        Thread.sleep(10000);

        System.out.println(map);
    }

    static class Key {

        int id;

        public Key(Integer id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {

            Key object = (Key) obj;

            if (obj == null) {
                return false;
            } else {
                return object.id == this.id;
            }
        }

        @Override
        public int hashCode() {

            int primeNumber = 971;
            return primeNumber * this.id;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "id=" + id +
                    '}';
        }
    }

    static class Value {

        private final String value;

        public Value(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
