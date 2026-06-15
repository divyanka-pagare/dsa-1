package oop;

public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);


        // final int bonus = 2;
        // bonus = 3;   // when use final keyword u cant modify it 


        final A divyanka = new A("Divyanka Pagare");

        divyanka.name = "other name";

        //when a non primitive is final, you can not reassign it.
        divyanka = new A("new Object");
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
        this.name = name;
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

*/