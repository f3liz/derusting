import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String five = "Hello";
    // Find the length of the string
    System.out.println(five.length());
    System.out.println();
    // Concatenate (add) two strings together and reassign the result
    String together = "hi" + "yellow";
    System.out.println();
    // Find the value of the character at index 3
    System.out.println(together.charAt(3));
    System.out.println();
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(together.contains("abc"));
    System.out.println();
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < together.length(); i++) {
      System.out.println(together.charAt(i));
    }
    System.out.println();
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    list.add("hello");
    list.add("goodbye");
    list.add("ham");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String.join(",", list);
    // Check whether two strings are equal
    System.out.println(five.equals(together));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
