import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

public class javacollection {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);



        // Creating a List using the [ArrayList Class](https://www.geeksforgeeks.org/java/arraylist-in-java/)
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Orange"); // Inserts at index 1

        // Accessing elements
        System.out.println("First Fruit: " + fruits.get(0));

        // Removing elements
        fruits.remove("Banana"); // By object
        fruits.remove(0);        // By index

        System.out.println("Updated List: " + fruits);





        // Creating a List using the [LinkedList Class](https://www.programiz.com/java-programming/list)
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.addLast("Task 2");  // LinkedList specific method
        tasks.addFirst("Urgent Task");

        // Peek at first and last elements
        System.out.println("Current: " + tasks.getFirst());

        // Iterating with an Iterator
        java.util.Iterator<String> it = tasks.iterator();
        while(it.hasNext()) {
            System.out.println("Processing: " + it.next());
        }


        // Creating a [Stack in Java](https://beginnersbook.com/java-collections-tutorials/)
        Stack<Integer> scores = new Stack<>();

        // Pushing elements onto the stack
        scores.push(100);
        scores.push(200);
        scores.push(300);

        // Popping the top element
        int top = scores.pop(); // Removes 300
        System.out.println("Popped: " + top);

        // Looking at the top element without removing it
        System.out.println("Next on top: " + scores.peek());
    }
}