package Collection;

import java.util.Set;

public class main {
    public static void main (String[] args){

        PhoneBook hm = new PhoneBook();
        hm.add("Иванов", "+79256745674");
        hm.add("Алексеев", "+79264568361");
        hm.add("Катеров", "+79255467363");
        hm.add("Никаноров", "+79268328443");
        hm.add("Елкин", "+79258674629");

        System.out.println(hm);
        System.out.println(hm.get("Иванов"));


    }
}
