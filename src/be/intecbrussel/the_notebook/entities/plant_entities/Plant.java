package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Plant {
    protected String name;
    protected double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant plant)) return false;
        return Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return height > 0.0
                ? "Plant -> " +
                "Name: " + name +
                " -> Height: " + height + "m"
                : name;
    }
}
