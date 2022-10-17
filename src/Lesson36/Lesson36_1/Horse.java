package Lesson36.Lesson36_1;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {

    public Horse(String name) {
        super(name);
    }

    public String toString(){
        return getName();
    }

}
