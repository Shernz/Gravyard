import java.util.*;
class ArrayLists
{
    public static void listAllNeeded(ArrayList<String> array)
    {
        for (String word : array) {
            System.out.println(word);
            System.out.println(word[0]);
        }
    }
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList <> ();
        array.add("Hello");
        array.add("World!!!!");
        listAllNeeded(array);
    }
}

/*import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);

    }
}*/