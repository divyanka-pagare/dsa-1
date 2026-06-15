package oop;

import java.util.*;

public class introduction {
    public static void main(String[] args) {
        //store 5 roll numbers
        // int[] numbers = new int[5];

        //store 5 names
        // String[] names = new String[5];

        //data of 5 students: {roll no, name, marks}

        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        // Student student1;
        // student1 = new student();
        // what new does? -> dynamic memory allocation

        // Student ritesh;
        // ritesh = new Student();

        
        // System.out.println(Arrays.toString(students));  //[null, null, null, null, null]

        // Student divyanka = new Student();  // constructor --> special function
        // Student ritesh = new Student(11, "Ritesh Girase", 95.4f);  
        
        // 11
        // Ritesh Girase
        // 95.4

        
        Student random = new Student();
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
        // 11
        // Ritesh Girase
        // 95.4

        Student random2 = new Student();

        
        // Student om = new Student(15, "Akhilesh", 89.4f);

        // System.out.println(om.rno);
        // System.out.println(om.name);
        // System.out.println(om.marks);

        // 15
        // Akhilesh
        // 89.4

        

        //by default
        // System.out.println(ritesh.rno); //0
        // System.out.println(ritesh.name); //null
        // System.out.println(ritesh.marks); //0.0

        // ritesh.rno=1;
        // ritesh.name="Ritesh Giase";
        // ritesh.marks= 95.0f;

        // ritesh.changeName("Divyanka");
        // ritesh.greeting();
        


        // System.out.println(ritesh.rno);
        // System.out.println(ritesh.name);
        // System.out.println(ritesh.marks);


        // System.out.println(ritesh.salary);  // error --> java is static type language


        //output
        // 1
        // Ritesh Giase
        // 95.0
    }
}


//create a class
// for every sigle student
class Student {
    int rno;
    String name;
    float marks = 90.0f;


    // we need a way to add the values of the above 
    // properties object by object
    // we need one word to access evey object

    void greeting() {
        System.out.println("Hello! my name is " + this.name);
    }
    
    void changeName(String newName) {
        name = newName;
    }
    //constructor
    // Student () {
    //     this.rno = 1;
    //     this.name = "Ritesh Girase";
    //     this.marks = 95.0f;
    // }

    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }


    Student () {
        // this is how you call a constructor from another constructor
        // internally : new Student (12, "default person", 100.0f)
        this(12, "default person", 100.0f);
    }


    //Student om = new Student(17, "Akhilesh", 89.3f);
    // here, this will be replaced with om

    Student (int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}

