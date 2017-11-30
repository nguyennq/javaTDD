package vn.nguyen.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import vn.nguyen.Model.Person;
import vn.nguyen.service.PersonDAO;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by nals on 11/28/17.
 */
public class PersonServiceTest {

    @Mock
    private PersonDAO personDAO;
    @InjectMocks
    private PersonService personService;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        personService = new PersonService(personDAO);
    }

    @Test
    public void testUpdatePerson_ShouldReturnTrueWhenUpdateSuccessful() throws Exception {
        Person person = preparedPerson();
        when(personDAO.fetchPerson(Integer.parseInt("123"))).thenReturn(person);
        boolean updatedPerson = personService.updatePerson(Integer.parseInt("123"),"Ronaldo");
        assertTrue(updatedPerson);
        verify(personDAO).fetchPerson(Integer.parseInt("123"));
        ArgumentCaptor<Person> argumentPersonCaptor = ArgumentCaptor.forClass(Person.class);
        verify(personDAO).updatePerson(argumentPersonCaptor.capture());
        Person actualPerson = argumentPersonCaptor.getValue();
        assertEquals("Ronaldo",actualPerson.getPersonName());
        verifyNoMoreInteractions(personDAO);
    }

    @Test
    public void testUpdatePerson_ShouldReturnFalseIfPersonNotFound() throws Exception{
        Person person = preparedPerson();
        when(personDAO.fetchPerson(Integer.parseInt("123"))).thenReturn(null);
        boolean updatedPerson = personService.updatePerson(Integer.parseInt("123"),"Ronaldo");
        assertFalse(updatedPerson);
        verify(personDAO).fetchPerson(Integer.parseInt("123"));
        verifyZeroInteractions( personDAO );
        verifyNoMoreInteractions( personDAO );
    }

    private Person preparedPerson() {
        Person person = new Person();
        person.setPersonID(Integer.parseInt("123"));
        person.setPersonName("Leonel Messi");
        return person;
    }

}