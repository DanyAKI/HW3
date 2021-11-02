package Collection;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> note = new HashMap<>();

    public void add(String name, String number){
       note.getOrDefault(name, new HashSet<>()).add(number);

    }

    public Set<String> get(String name){
        return note.getOrDefault(name, Collections.emptySet());

    }



}
