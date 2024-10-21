
public class string {

    public static void main(String[] args) {
        // String are imutable in java
        String str = new String();
        str = "Sarthak Vermani";
        String compare = "compare";

        System.out.println("Char At " + str.charAt(5));
        System.out.println("Substring " + str.substring(2,5));
        System.out.println("To compare two strings" + str.compareTo(compare));
        System.out.println("Index of" + str.indexOf('V'));
        System.out.println( "concatinate" + str.concat("OP"));


        // String buffer are mutable in java
        StringBuffer sb = new StringBuffer("String buffer");
        System.out.println("SB" + sb.toString() ); // Conversion to buffer string
        System.out.println("Appending in buffer " + sb.append(str));


        // Proving imutability of the Strings

        String s1 = "Sarthak";
        String s2 = "Sarthak";

        // S1 and S2 are having different refrences but they are same objects
        System.out.println( s1 == s2);



        


        
    }
    
}
