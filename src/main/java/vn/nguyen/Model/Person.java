package vn.nguyen.Model;

/**
 * Created by nals on 11/28/17.
 */
public class Person {
    private Integer personID;
    private String personName;

    public Person(Integer personID, String personName) {
        this.personID = personID;
        this.personName = personName;
    }

    public Person() {
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
