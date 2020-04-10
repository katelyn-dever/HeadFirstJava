import java.util.*;

public class stringUpperCase {

    public static void TestString(String s) {
        if(Character.isUpperCase(s.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("This program tests a function that determines whether the first character of a string is uppercase\n\n");
        String string1 = "this is lowercase";
        String string2 = "The first letter here is Uppercase";
        String string3 = "THIS IS UPPERCASE ALSO";

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add(string1);
        stringList.add(string2);
        stringList.add(string3);

        for(String s : stringList) {
            TestString(s);
        }
    }
}