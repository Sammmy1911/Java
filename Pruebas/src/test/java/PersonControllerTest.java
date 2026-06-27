import controller.PersonController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class PersonControllerTest {


    private PersonController controller;

    private void setups1(){
        controller = new PersonController();
    }

    private void setUp2(){
        controller = new PersonController();
        controller.addPeople(11, "Pato", "A0");
        controller.addPeople(12, "Peto", "A0");
        controller.addPeople(13, "Pito", "A0");
        controller.addPeople(14, "Saul", "A0");

    }




    @Test
    public void testAddPerson(){
        // init
        setups1(); // la lista esta vacia

        // act
        controller.addPeople(19, "Rao", "A0");

        // Assert
        //assertFalse(controller.getPeople().isEmpty());
        assertTrue( !controller.getPeople().isEmpty() );
    }

    @Test
    public void testAddPerson2(){
        // init
        setups1();

        // act
        String name = "NameA";
        int id = 20;
        String password = "A0";
        controller.addPerson(name, age, cc, password);

        // assert
        assertEquals(name, controller.getPeople().get(0).getName());
        assertEquals(id, controller.getPeople().get(0).getId());
        assertEquals(password, controller.getPeople().get(0).getPassword());
        //assertEquals(weight, 60.5, 0.3);
    }







}
