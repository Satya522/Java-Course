package src.JavaCourse.DSA.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(ArrayList<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !duplicates.contains(list.get(i))) {
                    duplicates.add(list.get(i));
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        List<Integer> duplicates = findDuplicates(list);
        System.out.println("Duplicates in the list: " + duplicates);
    }
}