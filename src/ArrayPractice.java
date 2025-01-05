public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] newArray = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    newArray[0] = "hello";
    newArray[1] = "bye";
    newArray[2] = "banana";
    newArray[3] = "ham";
    // Get the value of the array at index 2
    System.out.println(newArray[2]);
    System.out.println();
    // Get the length of the array
    System.out.println(newArray.length);
    System.out.println();
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i]);
    }
    System.out.println();
    // Iterate over the array using a for-each loop and print out each item
    for (String string : newArray) {
      System.out.println(string);
    }
    System.out.println();
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
