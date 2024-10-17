

/**
 * volume
 */
class volume {
    double h;
    double w;
    double l;

    // volume of a cuboid
    volume(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    // volume of a cube
    volume (double h) {
        this.h=h;
        this.w=h;
        this.l=h;
    }

    // default constructor
    volume () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // parameterised constructor
     volume ( volume v) {
        this.h = v.h;
        this.w = v.w;
        this.l = v.l;
     }

     // method for calculating the volume

     double calculateVolume () {
        return h*l*w;
     }

}


/**
 * student
 */
class student {

    int marks;
    String name;

    // compare objects

    boolean isMarksEqual(student stud1, student stud2) {
        if (stud1.marks == stud2.marks) {
            return true;
        } else {
            return false;
        }
    }
    
}

public class objectsAsParameters {
    public static void main(String[] args) {
        // calculating the volume in diffrent ways

        volume cuboidVolume = new volume(10,20,30); // volume of cuboid
        System.out.println("Volume of cuboid = " + cuboidVolume.calculateVolume() );


        volume cubeVolume = new volume(20); // volume of a cube
        System.out.println("Volume of a cube = " + cubeVolume.calculateVolume());

        // passing object as a paramater
        volume objectVolume = new volume(cuboidVolume); // create a copy of cuboidVolume

        System.out.println("Volume by objects = " + objectVolume.calculateVolume());

        // 1st object 
        student stud1 = new student();
        stud1.name = "Sarthak Vermani";
        stud1.marks = 90;


        // 2nd object
        student stud2 = new student();
        stud2.name = "sarthak";
        stud2.marks = 90;


        // 3r object
        student stud3 = new student();
        stud3.name = "somebody";
        stud3.marks = 93;

        boolean result = stud1.isMarksEqual(stud1, stud2);

        System.out.println("Is the result Same : " + result); // where the result is same

        boolean NotSameResult = stud1.isMarksEqual(stud1, stud3);

        System.out.println("Is the result Same : " + NotSameResult ); // where the result is not same


    }
    
}
