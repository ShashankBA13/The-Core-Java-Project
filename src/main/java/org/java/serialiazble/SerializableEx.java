package org.java.serialiazble;

import java.io.Serial;
import java.io.Serializable;

public class SerializableEx implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String author;
    private String title;
    private Integer numberOfPages;

    //getter and setters;
}
