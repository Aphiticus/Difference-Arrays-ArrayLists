import java.util.*;

public class ArraysAndArrayLists 
{
    public static void main(String[] args) 
    {
        // In Java’s realm, an array stands like a forest of fixed size trees each slot rooted in place, 
        // offering direct access but no room to sprout new branches.
        int[] arr = {2, 4, 6, 8};

        // An ArrayList, by contrast, flows like a river of boxed elements ever growing with each add(), 
        // gently shedding stones on remove(), and carrying primitives in object vessels.
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        System.out.println("Array: " + Arrays.toString(arr) + 
            " (fixed, length=" + arr.length + ") - Arrays have a fixed size and cannot grow or shrink dynamically.");
        System.out.println("List: " + list + 
            " (dynamic, size=" + list.size() + ") - ArrayLists can grow or shrink dynamically, making them more flexible.");

        // The array gifts raw speed and stability; the ArrayList grants agility and a rich application program interface. 
        // Together, they teach us when to choose the steadfast grove and when to follow the river’s course.
        list.add(10);
        list.remove(Integer.valueOf(4));
        System.out.println("List after add/remove: " + list + 
            " - Demonstrates the dynamic nature of ArrayLists by adding and removing elements.");

        arr[2] = 99;
        list.set(2, 99);
        System.out.println("Modified Array: " + Arrays.toString(arr) + 
            " - Shows how arrays allow direct modification of elements by index.");
        System.out.println("Modified List: " + list + 
            " - Shows how ArrayLists allow modification of elements using the set() method.");
    }
}
