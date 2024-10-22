
/**
 * Innerhuman
 */
class humanProperties {

    private String name;
    private int age;
    private static  String properties = "We are humans";

    static { // will always be called when the class is loaded
        System.out.println(properties);
    }

    public void getHumanProperties(){ // To get the value of the private data members of the class
        System.out.println("Human Name : " + name + " Human age : " + age);
    }

    public void setHumanProperties(String s, int n){ // To set the values of the private data members
        name = s;
        age = n;
    }


}

public class human {
    public static void main(String[] args) {
        humanProperties human = new humanProperties();
        human.setHumanProperties("sarthak,", 24);
        human.getHumanProperties();
    }
}
