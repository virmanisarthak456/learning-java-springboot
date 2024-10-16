/**
 * student
 */
 class student {
    int rollNo;
    String name;
    int marks;
}

public class arrayOfObjects {
    public static void main(String[] args) {
        // array of objects
        student s1 = new student();
        s1.rollNo = 1;
        s1.name = "sarthak vermani";
        s1.marks = 90;

        student s2 = new student();
        s2.name = "kaku";
        s2.rollNo = 2;
        s2.marks = 91;

        student s3 = new student();
        s3.name = "Ram";
        s3.rollNo = 3;
        s3.marks = 93;

        // creating array of objects

        student students[] = new student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
    }
}
