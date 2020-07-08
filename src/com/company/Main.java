package com.company;

@FunctionalInterface
 interface Cab {
//    void bookCab();

    //pass parameters
//    void bookCab(String source,String destination);

//    assign return type
     double bookCab(String source,String destination);
}
//class UberX implements Cab{
//
//    @Override
//    public void bookCab(String source, String destination) {
//        System.out.println("Uber booked from "+ source +" to " + destination + " arriving soon!!");
//    }
//}
public class Main {
    public static void main(String[] args) {
       // 1.
	// Normall method calling using class instance
//        Cab cab = new UberX();
//        cab.bookCab("Ruai","Kangani");


        // 2.
        //Anaonymous method Implementation
        //Its an inner class without a name in which a single object is created.
        //Usefull when making an an instance of an object with certain extras such as overloading of a class or interface.
//        Cab cab = new Cab() {
//            @Override
//            public void bookCab(String source, String destination) {
//                System.out.println("Uber booked from "+ source +" to " + destination + " arriving soon!!");
//            }
//        };
//        cab.bookCab("Kiambu","Mombasa");


        //3.
        //Lambda expression
        //Reducing down the anonymous class
        //Lambda expresions only work with functional interfaces(interface with only one abstract method)

        //without parameters
//        Cab cab = ()->{
//            System.out.println("Uber booked arriving soon");
//        };
//        cab.bookCab();

        //with parameters
//        Cab cab = (source,destination)->{
//            System.out.println("Uber booked from "+ source +" to " + destination + " arriving soon!!");
//        };
//        cab.bookCab("Kiambu","Nairobi");

        //with return type
        Cab cab = (source,destination)->{
            System.out.println("Uber booked from "+ source +" to " + destination + " arriving soon!!");
            return 850.12;
        };
        double fare = cab.bookCab("Kiambu","Nairobi");
        System.out.println("Fare shall be :"+fare);

        //LAMBDA PARAMETERS
        //1.Local Parameter
        //2.Instance variable
        //3.Static Variable

        //METHOD REFERENCE IN LAMBDA
    }
}
