package service;

import model.Person;

import java.util.List;

public interface PersonService {
    Person add(Person p);
    Person get(Integer id);
    List<Person> getAll();
    Person update(Integer id, Person p);
    void delete(Integer id);
}