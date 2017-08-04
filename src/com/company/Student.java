package com.company;

/**
 * Created by prade on 8/4/2017.
 */
public class Student extends Person {

    private String course;
    public final String getCourse(){
        return course;
    }
    public Student(String name, int age, String course){
        super(name,age);
        this.course=course;
    }

    public void GoToNextClass(){

    }

    @Override
    void ageBy1Year() {
        super.age++;
    }
}
