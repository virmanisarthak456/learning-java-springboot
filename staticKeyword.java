
/**
 * impliment static
 */
class implimentStatic {
    // statickeyword

    String name;
    int rollNo;
    static double weight; // static varibale, the value of this variable will be same for all the objects until and unless its changed



    implimentStatic (){
        name = "";
        rollNo = 0;
    }

    // static block : is Used to initialise the static datamembers / variables, it is called even before the custructor while loading the class, as class loader is called first and then the objects are instantiated
    static {
        weight = 90;
        System.out.println("Inside the static block");
    }


    // decalring a non - static method

    public void nonStatic(){
        System.out.println("Name : " + name + " rollNo : " + rollNo + " weight : " + weight);
        // We can use a static method inside a non static method
    }

    // declaring a static method

    // static functions can be called directly , we dont need to create an object of the class to call a static method
    public static void staticMethod(implimentStatic obj){

        // we can not use non static variables inside a static method directly
        //  System.out.println("Name : " + name + " rollNo : " + rollNo + " weight : " + weight);

        // To use a static variable , we can pass an object of same class to accesss the static variable

         System.out.println( " Static method printing " +" Name : " + obj.name + " rollNo : " + obj.rollNo + " weight : " + weight);

    }

}

public class staticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {

        implimentStatic obj1 = new implimentStatic();
        obj1.name = "sarthak vermani";
        obj1.rollNo = 58;
        implimentStatic.weight = 80; // while assigning a value to a static variable, we have too use static method ie class name

        implimentStatic obj2 = new implimentStatic();
        obj2.name = "Ram";
        obj2.rollNo = 90;
        obj2.weight = 90; // we can use this as well, but its not a good practice

        implimentStatic obj3 = new implimentStatic();
        obj3.name = "Sham";
        obj3.rollNo = 91;

        // Making an array of objects , just to revise the syntax

        implimentStatic[] arrayObj = new implimentStatic[3];

        arrayObj[0] = obj1;
        arrayObj[1] = obj2;
        arrayObj[2] = obj3;

        // Using for each loop to print the array of objects

        for (implimentStatic obj : arrayObj) {
            System.out.println("Name : " + obj.name + " rollNo : " + obj.rollNo + " weight : " + implimentStatic.weight);
        }

        // Calling the static method;
        implimentStatic.staticMethod(obj1);

        // Calling static block
        Class.forName("implimentStatic");
        
    }
}
