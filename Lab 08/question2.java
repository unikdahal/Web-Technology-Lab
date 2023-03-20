//A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.

import  java.util.*;

class TwoD{
    int length;
    int breadth;
    int cost1;
    int area;

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
    }

    void calculate(){
        area = length*breadth;
        cost1 = area*40;
    }

    void display() {
        System.out.println("The area is " + area);
        System.out.println("The cost is " + cost1);
    }

}

class ThreeD extends TwoD{
    int height;
    int cost2;
    int volume;

    void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        height = sc.nextInt();
    }

    void calculate(){
        super.calculate();
        volume = length*breadth*height;
        cost2 = volume*60;
    }

    void display() {
        super.display();
        System.out.println("The volume is " + volume);
        System.out.println("The cost is " + cost2);
    }

}

class question2 {
    public static void main(String[] args) {
        ThreeD obj = new ThreeD();
        obj.read();
        obj.calculate();
        obj.display();
    }
}