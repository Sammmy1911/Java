package controller;
import model.Person;

import java.lang.foreign.AddressLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonController {

    private ArrayList<Person> people;

    public PersonController() {
        people = new ArrayList<>(5);
    }

    public void addPeople(int id, String name, String password){
        Person person = new Person(id,name,password);
        people.add(person);
    }

    public ArrayList<Person> getPeople(){
        return people;
    }


}