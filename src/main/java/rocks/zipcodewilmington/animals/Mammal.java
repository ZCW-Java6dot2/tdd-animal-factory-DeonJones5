package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public abstract class Mammal implements Animal {
    private Integer id;
    private ArrayList<Food> eatenMeals;
    private String name;
    private Date birthDate;

    public Mammal(String name, Date birthDate, Integer id) {
        this.name = name;
        this.birthDate = birthDate;
        this.eatenMeals = new ArrayList<>();
        this.id = id;
    }

    public Mammal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Mammal(Integer id) {
        this.id = id;
    }

    public Mammal(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Mammal(String name) {
        this.name = name;
    }

    public Mammal() {
        this.eatenMeals = new ArrayList<>();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Food> getEatenMeals() {
        return eatenMeals;
    }

    public void setEatenMeals(ArrayList<Food> eatenMeals) {
        this.eatenMeals = eatenMeals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    public void eat(Food food) {
        eatenMeals.add(food);
    }

    @Override
    public Integer getId() {
        return id;
    }
}
