

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

public class objectsAsParameters {
    public static void main(String[] args) {
        // calculating the volume in diffrent ways

        volume cuboidVolume = new volume(10,20,30); // volume of cuboid
        System.out.println("Volume of cuboid = " + cuboidVolume.calculateVolume() );


        volume cubeVolume = new volume(20); // volume of a cube
        System.out.println("Volume of a cube = " + cubeVolume.calculateVolume());

        volume objectVolume = new volume();
        objectVolume.h = 10; // height
        objectVolume.l = 20; // length
        objectVolume.w = 30; // width

        System.out.println("Volume by objects = " + objectVolume.calculateVolume());

    }
    
}
