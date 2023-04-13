package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal {
    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
        plantDiet = new LinkedHashSet<>();
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet = new LinkedHashSet<>();
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore -> " +
                super.toString() +
                " -> Max Food Size: " + maxFoodSize + "m" +
                " -> Plant Diet: " + plantDiet;
    }
}
