## 📄 Description - Exercise Statement

This is the eighth task for **Sprint 1 Java Language** in the **Backend Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

## Level 1

For all exercises, the Java API for Lambdas and Streams of Java 8+ must be used.

### Exercise 1

-   From a list of Strings, write a method that returns a list of all the strings containing the letter ‘o’. Print the result.

### Exercise 2

-   Do the same as in the previous point, but now, the method must return a list with Strings that, in addition to containing the letter ‘o’, also have more than 5 letters. Print the result.

### Exercise 3

-   Create a list with the names of the months of the year. Print all the elements of the list with a lambda.

### Exercise 4

-   Do the same print as in the previous point, but using method reference.

### Exercise 5

-   Create a Functional Interface with a method called getPiValue() that must return a double. From the main() of the main class, instantiate the interface and assign it the value 3.1415. Invoke the getPiValue() method and print the result.

### Exercise 6

-   Create a list with numbers and strings and sort the list with the strings from shortest to longest.

### Exercise 7

-   With the list from the previous exercise, now sort it in reverse, from longest string to shortest.

### Exercise 8

-   Create a Functional Interface that contains a method called reverse(). This method must receive and return a String. In the main() of the main class, inject into the created interface using a lambda the body of the method, so that it returns the same string it receives as a parameter but reversed. Invoke the interface instance passing a string and check if the result is correct.

* * *

## Level 2

### Exercise 1

-   Create a list of strings with proper names. Write a method that returns a list of all the strings that begin with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.

### Exercise 2

-   Write a method that returns a comma-separated string based on a list of Integers. Each element must be preceded by the letter “e” if the number is even, or by the letter “o” if the number is odd. For example, if the input list is (3, 55, 44), the output should be “o3, o55, e44”. Print the result.

### Exercise 3

-   Create a Functional Interface that contains a method called operacio(). This method must return a float. Inject into the created interface using a lambda the body of the method, so that it can perform addition, subtraction, multiplication, and division.

### Exercise 4

-   Create a list containing some strings and numbers.
-   Sort them by:
    -   Alphabetically by the first character. (Note: charAt(0) returns the numeric code of the first character)
    -   The strings that contain an "e" first, the rest of the strings after. Write the code directly in the lambda.
    -   Modify all elements of the list that contain an ‘a’. Replace the ‘a’ with a ‘4’.
    -   Show only the elements that are numeric. (Even if stored as Strings).

* * *

## Level 3

### Exercise 1

Create a class called Alumne with the attributes: Name, age, course, and grade.

Fill a list with 10 students.

-   Show the name and age of each student on the screen.
-   Filter the list for all students whose names start with ‘a’. Assign these students to another list and display the new list on the screen (all using lambdas).
-   Filter and display on the screen the students who have a grade of 5 or higher.
-   Filter and display on the screen the students who have a grade of 5 or more, and who are not from PHP.
-   Show all students who are taking JAVA and are of legal age.

## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under *Java version* : openjdk 21.0.8 2025-07-15.


