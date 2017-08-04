package com.company;

/**
 * Created by prade on 8/4/2017.
 */
public class Executive extends Person {

    private String department;
    public String getDepartment(){return department;}
    public Executive(String name, int age, String department){
        super(name, age);
        this.department=department;
    }
}
