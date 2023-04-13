package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        this.carnivores = new ArrayList<>();
        this.omnivores = new ArrayList<>();
        this.herbivores = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            return;
        }

        if (!animals.contains(animal)) {
            animalCount++;
            animals.add(animal);
            System.out.println(animal.getName() + " was successfully added to the animals list!");
        } else {
            System.out.println(animal.getName() + " was already been added to this list!");
        }
    }

    public void addPlant(Plant plant) {
        if (plant == null) {
            return;
        }

        if (!plants.contains(plant)) {
            plantCount++;
            plants.add(plant);
            System.out.println(plant.getName() + " was successfully added to the plants list!");
        } else {
            System.out.println(plant.getName() + " was already been added to this list!");
        }

    }

    public void printNotebook() {
        System.out.println("ANIMALS");
        System.out.println("-".repeat(100));
        animals.forEach(System.out::println);
        System.out.println("-".repeat(100));
        System.out.println("PLANTS");
        System.out.println("-".repeat(100));
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight).reversed());
    }

    public void sortPlantsHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight).reversed());
    }
}
