import junit5_assignment.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

        @Test
        public void testGetNameWithNonNullValue() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            Assertions.assertEquals("Salil Verma", person.getName());
        }

        @Test
        public void testGetNameWithNullValue() {
            Person person = new Person(null, 22, "salil.verma@knoldus.com");
            Assertions.assertNull(person.getName());
        }

        @Test
        public void testGetAgeWithNonNullValue() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            Assertions.assertEquals(22, person.getAge());
        }
        @Test
        public void testSetAgeWithPositiveInteger() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            person.setAge(40);
            Assertions.assertEquals(40, person.getAge());
        }

        @Test
        public void testSetAgeWithNegativeInteger() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            person.setAge(-10);
            Assertions.assertEquals(-10, person.getAge());
        }

        @Test
        public void testSetAgeWithZero() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            person.setAge(0);
            Assertions.assertEquals(0, person.getAge());
        }

        @Test
        public void testGetEmailWithNonNullValue() {
            Person person = new Person("Salil Verma", 22, "salil.verma@knoldus.com");
            Assertions.assertEquals("salil.verma@knoldus.com", person.getEmail());
        }

        @Test
        public void testGetEmailWithNullValue() {
            Person person = new Person("Salil Verma", 22, null);
            Assertions.assertNull(person.getEmail());
        }
    }


