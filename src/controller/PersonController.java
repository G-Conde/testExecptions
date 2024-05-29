package controller;

import model.Person;
import service.impl.PersonServiceImpl;

public class PersonController {

    private PersonServiceImpl personService;
    public Person get(Integer id) {
        return personService.get(id);
    }
}