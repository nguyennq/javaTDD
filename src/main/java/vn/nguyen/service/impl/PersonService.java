package vn.nguyen.service.impl;

import vn.nguyen.Model.Person;
import vn.nguyen.service.PersonDAO;

/**
 * Created by nals on 11/28/17.
 */
public class PersonService  {
    
    private PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public boolean updatePerson(Integer personID, String name){
        Person person = personDAO.fetchPerson(personID);
        if(person != null){
            Person updatePerson = new Person(person.getPersonID(),name);
            personDAO.updatePerson(updatePerson);
            return true;
        }
        else {
            return false;
        }
        
    }
}
