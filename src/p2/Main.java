package p2;

import java.util.HashMap;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(2, "Ivan");
        names.put(4, "Masha");
        names.put(100, "Alex");

        String name = names.get(1);
        System.out.println(name);
        Set<Integer> keys = names.keySet();
        System.out.println(keys);
        Collection<String> values = names.values();
        System.out.println(values);

        System.out.println(names.put(1, "Sergey"));

        System.out.println(names.replace(1, "Dima"));

        for(Map.Entry<Integer, String> item: names.entrySet()){
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        //System.out.println(names.remove(1, "Dima"));
        System.out.println(names);

        TreeMap<Integer, String> sortMap = new TreeMap<>(names);
        System.out.println(sortMap);

        List<Integer> mapKeys = new ArrayList<>(names.keySet());
        Collections.sort(mapKeys);
        System.out.println(mapKeys);

        List<String> mapVal = new ArrayList<>(names.values());
        Collections.sort(mapVal);

        System.out.println(mapVal);

        Map<Integer, People> peopleMap = new HashMap<>();
        peopleMap.put(10, new People(1,"Ivan"));
        peopleMap.put(20, new People(2, "Alex"));
        peopleMap.put(30, new People(3, "Alex"));
        System.out.println(peopleMap);

        TreeMap<Integer, People> peopleTreeMap = new TreeMap<>(peopleMap);
        System.out.println(peopleTreeMap);

        SortedSet<People> mapValues = new TreeSet<>(peopleMap.values());
        System.out.println(mapValues);






    }

}
