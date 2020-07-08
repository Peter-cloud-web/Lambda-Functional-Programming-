package com.company;
//Method Referencing in Lambda expressions
@FunctionalInterface
interface Calculator {
    //abstract method with parameters
    void add(int num1, int num2);
}
@FunctionalInterface
interface Messanger{
    void getMessage(String messageRelayer);
}
//Constructor to be referenced
class Message{
    Message(String messageRelayer){
        System.out.println("Message is :" + messageRelayer);
    }
}

class Calc {
    //static method implementation
    public static void addSomething(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is :" + sum);
        System.out.println(num1 + "and" + num2 + "addition is" + (num1 + num2));
    }
    //Non static method implementation
    public void letsAdd(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is :" + sum);
        System.out.println(num1 + " and " + num2 + " addition is " + (num1 + num2));
    }

}


public class MethodReferences {
    // 1.Refering to a static method using lambda expression (Method reference to a static method)
    public static void main(String[] args){
        //:: - refers to scope resolution used for method referencing used to call a method by refering to it using its class.
        // 1.reference to a static method
        Calculator sum = Calc::addSomething;
        sum.add(10,30);

        // 2.reference to a non-static or instance method
        //Object construction
        Calc calc = new Calc();
        Calculator refCalc = calc::letsAdd;
        refCalc.add(30,80);

        // 3.reference to a constructor
        Messanger messanger = Message::new;
        messanger.getMessage("Search the candle rather than cursing the darkness");


    }
}

