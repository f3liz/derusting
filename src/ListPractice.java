import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> newList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    newList.add("hello");
    newList.add("bye");
    newList.add("meow");
    // Print the element at index 1
    System.out.println(newList.get(1));
    System.out.println();
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    newList.set(1, "dog");
    // Insert a new element at index 0 (the length of the list will change)
    newList.add(0, "ham");
    // Check whether the list contains a certain string
    newList.contains("ham");
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < newList.size(); i++) {
      System.out.println(newList.get(i));
    }
    System.out.println();
    // Sort the list using the Collections library
    Collections.sort(newList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String string : newList) {
      System.out.println(string);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}