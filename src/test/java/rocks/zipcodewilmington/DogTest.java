package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;
    @Before
    public void setup() {
        this.dog = new Dog();
    }
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";

        // when
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthPlaceTest() {
        Date expected = new Date();

        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();

        // when
        dog.setBirthDate(expected);

        // then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest() {
        // given
        Food food = new Food();

        int initialMealsEaten = dog.getNumberOfMealsEaten();

        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        int expected = initialMealsEaten + 1;

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog();

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }
    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Dog();

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }
    @Test
    public void idTest(){
        Integer expectedId = 1;
        Dog dog = new Dog(expectedId);

        Integer retrievedId = dog.getId();
        Assert.assertEquals(expectedId, retrievedId);


    }
    public void constructorTest() {
        // Given (cat data)
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
