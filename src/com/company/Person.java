package com.company;

/**
 * Created by prade on 8/4/2017.
 */
public abstract class Person {
    private transient String name;
    protected int age;

    abstract void ageBy1Year();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Person(){
        this.name="";
        this.age=-1;
    }
}
