package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class NatureApp {
    public static void main(String[] args) {
        lineGenerator();
        System.out.println("FOREST NOTEBOOK TEST");
        lineGenerator();

        ForestNotebook forestNotebook = new ForestNotebook();

        Plant plant = new Plant("Orchid", 0.55);
        Tree tree = new Tree("Pine tree", 40.5);
        tree.setLeafType(LeafType.NEEDLE);
        Flower flower = new Flower("Rose", 0.15);
        flower.setSmell(Scent.SWEET);
        Weed weed = new Weed("Dandelion", 0.05);
        // Geen idee over wat was de echte bedoeling van deze methode hieronder. Ik heb een willekeurig cijfer daarin geplaatst.
        weed.setArea(10.5);
        Bush bush = new Bush("Blueberry bush", 3.5);
        bush.setLeafType(LeafType.SPEAR);
        bush.setFruit("Blueberry");

        forestNotebook.addPlant(plant);
        forestNotebook.addPlant(tree);
        forestNotebook.addPlant(flower);
        forestNotebook.addPlant(weed);
        forestNotebook.addPlant(bush);
        forestNotebook.addPlant(plant);

        List<Carnivore> carnivoreList = new ArrayList<>();
        List<Herbivore> herbivoreList = new ArrayList<>();
        List<Omnivore> omnivoreList = new ArrayList<>();

        Carnivore lion = new Carnivore("Lion", 190, 1.2, 2.1);

        // Geen idee over wat was de echte bedoeling van deze methode hieronder. Ik heb een willekeurige maat daarin geplaatst.
        lion.setMaxFoodSize(1.5);
        carnivoreList.add(lion);
        forestNotebook.setCarnivores(carnivoreList);

        Herbivore elephant = new Herbivore("Elephant", 6000, 3.2, 6.5);

        Set<Plant> elephantDiet = new LinkedHashSet<>();
        Plant plant1 = new Plant("Grasses");
        Plant plant2 = new Plant("Leaves");
        Plant plant3 = new Plant("Fruits");
        Plant plant4 = new Plant("Roots");

        elephantDiet.add(plant1);
        elephantDiet.add(plant2);
        elephantDiet.add(plant3);
        elephant.setPlantDiet(elephantDiet);

        elephant.addPlantToDiet(plant4);

        herbivoreList.add(elephant);
        forestNotebook.setHerbivores(herbivoreList);

        Omnivore bear = new Omnivore("Bear", 500, 1.5, 2.8);
        bear.setMaxFoodSize(1.5);

        Set<Plant> bearDiet = new LinkedHashSet<>();
        bearDiet.add(new Plant("Berries"));
        bearDiet.add(plant1);
        bear.setPlantDiet(bearDiet);
        bear.addPlantToDiet(plant4);

        omnivoreList.add(bear);
        forestNotebook.setOmnivores(omnivoreList);

        Animal animal1 = new Animal("Gorilla", 270, 1.8, 1.7);
        Animal animal2 = new Animal("Anaconda", 250, 0.3, 8.5);
        Animal animal3 = new Animal("Red fox", 14, 0.5, 0.85);
        Animal animal4 = new Animal("Rabbit", 2, 0.22, 0.45);
        Animal animal5 = new Animal("Wolf", 80, 0.85, 1.6);
        Animal animal6 = new Animal("Eagle", 6, 0.61, 0.90);

        forestNotebook.addAnimal(lion);
        forestNotebook.addAnimal(elephant);
        forestNotebook.addAnimal(bear);
        forestNotebook.addAnimal(animal1);
        forestNotebook.addAnimal(animal2);
        forestNotebook.addAnimal(animal3);
        forestNotebook.addAnimal(animal4);
        forestNotebook.addAnimal(animal5);
        forestNotebook.addAnimal(animal6);
        forestNotebook.addAnimal(lion);

        lineGenerator();
        System.out.println("TOTAL PLANTS AND ANIMALS");
        lineGenerator();
        System.out.println("Plants -> " + forestNotebook.getPlantCount());
        System.out.println("Animals -> " + forestNotebook.getAnimalCount());

        lineGenerator();
        System.out.println("UNSORTED LIST OF PLANTS AND ANIMALS");
        lineGenerator();
        forestNotebook.printNotebook();

        lineGenerator();
        System.out.println("LIST OF CARNIVORE, OMNIVORE AND HERBIVORE ANIMALS");
        lineGenerator();
        forestNotebook.getCarnivores().forEach(System.out::println);
        forestNotebook.getOmnivores().forEach(System.out::println);
        forestNotebook.getHerbivores().forEach(System.out::println);

        lineGenerator();
        System.out.println("LIST OF PLANTS AND ANIMALS SORTED BY NAME");
        lineGenerator();

        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();
        forestNotebook.printNotebook();

        // Ik heb alle metingen omgezet naar meters om correct te kunnen sorteren.

        lineGenerator();
        System.out.println("BONUS - LIST OF PLANTS AND ANIMALS SORTED BY HEIGHT");
        lineGenerator();

        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsHeight();
        forestNotebook.printNotebook();
    }

    public static void lineGenerator() {
        System.out.println("-".repeat(100));
    }
}
