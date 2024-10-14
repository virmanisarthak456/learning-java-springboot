import java.util.*;

// building stack class

/**
 * implimentStack
 */
class implimentStack {
    int index;
    int [] stackArray = new int[10];

    implimentStack(){ //constructor
        index = -1;
    }

    // push method
    void push(int n){

        if (index == 9) {
            System.out.println("stack over flow exeption");
        } else {
            stackArray[++index] = n;
        }

    }

    // pop method
    void pop (){

        if (index == -1) {
            System.out.println("stack undeflow exeption");
        } else {
            System.out.println("latest element in the array" + " " + stackArray[index--]);
        }
    }

}

public class stack {
    public static void main(String[] args) {
        implimentStack stack = new implimentStack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Printing all the elemnets of the stack");

        for (int i = 0; i < stack.stackArray.length; i++) {
            System.out.println("Element of the array" + " " + stack.stackArray[i]);
        }

    }
}
