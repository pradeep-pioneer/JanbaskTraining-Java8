package com.company;
import com.example.*;
public class Main {

    public static void main(String[] args) {
        AbstractClassDemo();

    }

    static void PublicClassDemo(){
        PublicClass classEx = new PublicClass();
        com.example.PublicClass classEx1 = new com.example.PublicClass();

    }

    static  void  intantiationDemo(){
        Student s, s1, s3;
    }

    static void AbstractClassDemo(){
        Person p = new Student("Test", 23, "BSC");
        Student s = new Student("Test", 23, "BSC");
        Person person = new Person("non abstract", 45);
        //person.ageBy1Year();
        //the below commented lines are used for describing a situation as to how assignment works between super and sub types
//        Person nonAbstract = new Person("Another person", 54);
//        nonAbstract = s;
        Student castedStudent = (Student)p;
        Executive ex = new Executive("Test", 23, "Sales");
        Person executivePerson = ex;
        System.out.println(p.getName() + " is " + p.getAge() + " years old");
        System.out.println(s.getName() + " is " + s.getAge() + " years old and he is studying in " + s.getCourse());
    }
}
