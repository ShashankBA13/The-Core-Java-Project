package org.java.serialiazble;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableEx implements Externalizable {

    private String author;
    private String title;
    private Integer price;

    public ExternalizableEx(){}

    public ExternalizableEx(String author, String title, Integer price){
        this.author = author;
        this.title = title;
        this.price = price;
    }
    // getters and setters

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(author);
        out.writeObject(title);
        out.writeObject(price);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.author = (String) in.readObject();
        this.title = (String) in.readObject();
        this.price = in.readInt();
    }
}
