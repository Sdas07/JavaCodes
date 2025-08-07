/*
Program Name: ReplaceBugFixed.java

Objective:
To replace a specific name in an ArrayList at a given index.

Original Bug:
names.set(3, "Rahul");

- Issue: ArrayList only had 3 elements → valid indices: 0, 1, 2
- Trying to access index 3 caused `IndexOutOfBoundsException`
  because in arrays and lists, **last index = size - 1**

Fix Applied:
Changed index `3` to `2`:
names.set(2, "Rahul");

Output:
Updated List: [Sohom, Ankit, Rahul]

Summary:
- Arrays and ArrayLists in Java are **0-indexed**
- Always ensure index used in `.set()` is less than `size()`
*/


import java.util.ArrayList;
public class ReplaceBugFixed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sohom");
        names.add("Ankit");
        names.add("Ravi");

        names.set(2, "Rahul");

        System.out.println("Updated List: "+names);
    }
}
