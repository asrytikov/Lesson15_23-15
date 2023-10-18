import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> names = new ArrayDeque<>();
        names.add("Ivan");
        names.addFirst("Masha");
        names.addLast("Alex");
        names.push("Irina");

        for (String each: names) {
            System.out.println(each);
        }

        System.out.println("---------------------");

       /* while (names.peek() != null){
            System.out.println(names.poll());
        }*/

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(names.size());

        String name1 = names.getFirst();
        String name2 = names.getLast();
        String name3 = names.peekFirst();
        String name4 = names.peekLast();

        System.out.printf("First : %s = %s\n", name1, name3);
        System.out.printf("Last : %s = %s\n", name2, name4);

        System.out.println(names.removeFirst());
        System.out.println(names.removeLast());

        System.out.println(names.size());

        System.out.println(names.removeFirstOccurrence("Masha"));
        System.out.println(names.removeLast());
        System.out.println(names.peek());





    }
}