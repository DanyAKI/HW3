package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }


    private static void task2(){
        Directory hm = new Directory();
        hm.add("Ivanov", "+79256745674");
        hm.add("Alekseev", "+79264568361");
        hm.add("Katerov", "+79255467363");
        hm.add("Nikonorov", "+79268328443");
        hm.add("Elkin", "+79258674629");
        hm.add("Ivanov", "+7925672833");

        System.out.println(hm.get("Ivanov"));
        System.out.println();


    }
}



