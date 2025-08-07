/*
Program Name: ContainsBugFixed.java

Objective:
To check if a given fruit (string) exists in an ArrayList of fruits.

Original Bug:
String target = "mango";

- Issue: The `contains()` method is **case-sensitive**.
- Since the list had "Mango" (with uppercase 'M'), but the target was "mango", it returned `false` even though the fruit exists in the list.

Fix Applied:
Changed `target = "mango";` → `target = "Mango";`

Alternatively (optional improvement):  
Convert both to lowercase using `.toLowerCase()` for case-insensitive check:
```java
if (fruits.stream().anyMatch(fruit -> fruit.equalsIgnoreCase(target))) { ... }
Output:
Fruit found!

Summary:
contains() checks for exact match, including case.
Always ensure both sides match in case or use equalsIgnoreCase() if case shouldn't matter.
*/


import java.util.ArrayList;
public class ContainsBugFixed {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        String target = "Mango";

        if (fruits.contains(target)) {
            System.out.println("Fruit found!");
        } else {
            System.out.println("Fruit not found!");
        }
    }
}
