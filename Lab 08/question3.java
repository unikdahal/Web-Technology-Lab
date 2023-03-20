//Illustrate the usage of abstract class with following Java classes –
//        i)An abstract class „student‟ with data member roll no, reg no and a
//            abstract method course()
//        ii)A subclass „kiitian‟ with course() method implementation

import java.util.*;

abstract class Student{
    int roll_no;
    int reg_no;

    abstract void course();
}

class Kiitian extends Student{
    void course(){
        System.out.println("The course is B.Tech");
    }
}

class question3 {
    public static void main(String[] args) {
        Kiitian obj = new Kiitian();
        obj.course();
    }
}