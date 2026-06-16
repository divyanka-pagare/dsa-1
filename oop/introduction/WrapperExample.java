package oop.introduction;

// import java.util.*;
public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);  // this will not work because java is pass by value , only local variable inside swap() will chnage. The original a and b in main() remain unchanged.
        System.out.println(a + " " + b);


        // final int bonus = 2;
        // bonus = 3;   // when use final keyword u cant modify it 


        // final A divyanka = new A("Divyanka Pagare");
        // divyanka.name = "other name";

        //when a non primitive is final, you can not reassign it.
        // divyanka = new A("new object");

        A obj = new A("hkshweufj");
        System.out.println(obj);
        // for (int i = 0; i < 1000; i++) {
        //     obj = new A("Random name");
        // }
    }

    // error: cannot assign a value to final variable divyanka
    //     divyanka = new A("new Object");
    //     ^
    // 1 error




    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
class A {
    final int num = 10;
    String name;

    public A(String name) {
        // System.out.println("Object is destroyed");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}


// final -> always initialize while declaring it because you cant modify it later
// you can not make any change when it is premitive data type 
// when it is non premitive data type then you can make change in value but you can not reassign it 

/*

final int INCREASE = 2;

always initialize while declaring

final studnet ritesh = new Student();
ritesh.name = "Ritesh Girase";

ritesh = other object // this is not allowed



----------------------------------------------------------
like constructors there are destructors 

you can not destroy the object manually but you can decide 
what will happen when object get destroyed by garbage collection 

java says you can specify this specific actions that will occurs 
when the object is about to be taken away by garbage collector using finalizer 

and finalizer u can add by using finalize method 

*/