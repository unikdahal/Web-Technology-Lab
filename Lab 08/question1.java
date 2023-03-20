//Write a program in Java to define a class Number with appropriate data
//        members and member functions to input n number of integers and swap the biggest
//        and smallest elements. Use member functions read(), swap() and display().

import  java.util.*;

class Number{

    int n;
    int arr[];

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

    void swap(){
        int max = arr[0];
        int min = arr[0];
        int max_index = 0;
        int min_index = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
            }
            if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = temp;
    }

    void display(){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
}