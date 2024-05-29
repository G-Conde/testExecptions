import model.Person;
import service.impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> l = new ArrayList<>();
        PersonServiceImpl ps = new PersonServiceImpl(l);
        Person p = new Person(0, "aaa", "bbb", 18);
        ps.add(p);
        System.out.println(ps.get(p.getId()));
        Person p1 = new Person(0, "ccc", "ddd", 20);
        System.out.println(ps.update(1, p1));
    }
}