package src.JavaCourse.DSA.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class RemoveDuplicate {
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer i: list){
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }

        }
        return newList;
    }
    // using stream() method
    public static ArrayList<Integer> removeDuplicateUsingStream(ArrayList<Integer> list){
        List<Integer> newList = list.stream().distinct().toList();
        return new ArrayList<>(newList);

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
        System.out.println("List before removing duplicates: "+list);
        System.out.println("List after removing duplicates: "+removeDuplicateUsingStream(list));

    }
}
