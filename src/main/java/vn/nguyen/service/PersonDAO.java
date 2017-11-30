package vn.nguyen.service;

import vn.nguyen.Model.Person;

/**
 * Created by nals on 11/28/17.
 */
public interface PersonDAO {
    public Person fetchPerson(Integer personID);
    public void updatePerson(Person person);
}
