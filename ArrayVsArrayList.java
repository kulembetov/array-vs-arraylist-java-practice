import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // fixed size, elements are accessed via index
        // initialize an array of size 5
        String[] friendsArray = new String[5];
        // assign value at index 0
        friendsArray[0] = "Jimmy";
        System.out.println("initial empty friendsArray, after we assigned the 1st element: " + Arrays.toString(friendsArray));
        // initialize with values
        String[] friendsArray2 = {"John", "Paul", "George", "Ringo"};
        // access element at index 3
        System.out.println("initially created and populated friendsArray2 with 4 elements: " + Arrays.toString(friendsArray2));

        // dynamic size, provides methods for easy manipulation
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        // adding an element
        friendsArrayList.add("Chris");
        // access element at index 4
        System.out.println("friendsArrayList after adding a new element at the end: " + friendsArrayList);
        // modify element at index 4
        friendsArrayList.set(4, "Lennon");
        // access modified element
        System.out.println("friendsArrayList after replacing the 4th element with the new element: " + friendsArrayList);

        // remove the first element
        friendsArrayList.remove(0);
        // remove the element "Paul"
        friendsArrayList.remove("Paul");
        System.out.println("friendsArrayList after removing the 1st and 2nd elements: " + friendsArrayList);

        // example of arraylist with integer
        ArrayList<Integer> friendsAgeArrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        // adding an element
        friendsAgeArrayList.add(50);
        System.out.println("friendAgeArray after adding a new element after creation:" + friendsAgeArrayList);

        // checking size of arraylist
        System.out.println("size of friendsAgeArrayList: " + friendsAgeArrayList.size());
    }
}