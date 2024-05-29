package service.impl;

import model.Person;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonServiceImpl implements PersonService {

    private List<Person> personList;

    public PersonServiceImpl() {
        personList = new ArrayList<>();
    }

    public PersonServiceImpl(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public Person add(Person p) throws RuntimeException {
        try {
            if (p.getAge() >= 18) {
                personList.add(p);
                return p;
            } else {
                throw new RuntimeException("La persona es menor de edad!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Person get(Integer id) throws NoSuchElementException {
        Person p = new Person();
        try {
            for (int x = 0; x < personList.size(); x++) {
                personList.get(10);
                if (personList.get(x).getId().equals(id)) {
                    p = personList.get(x);
                    break;
                }
            }
            if (p.getName() == null) {
                throw new NoSuchElementException("Persona no encontrada get!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    @Override
    public List<Person> getAll() {
        try {
            return personList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Person update(Integer id, Person p) {
        try {
            for (Person person : personList) {
                if (person.getId().equals(id)) {
                    person.setName(p.getName());
                    person.setSurname(p.getSurname());
                    person.setAge(p.getAge());
                    p = null;
                    break;
                }
            }
            if (p != null) {
                throw new NoSuchElementException("Persona no encontrada update!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    @Override
    public void delete(Integer id) {
        Person p = new Person();
        try {
            for (Person person : personList) {
                if (person.getId().equals(id)) {
                    p = person;
                    personList.remove(person);
                    break;
                }
            }
            if (p.getName() == null) {
                throw new NoSuchElementException("Persona no encontrada delete!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}