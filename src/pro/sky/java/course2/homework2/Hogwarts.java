package pro.sky.java.course2.homework2;

import java.util.Objects;

public abstract class Hogwarts {
    private String name;                 //имя
    private int powerOfSorcery;          //мощность колдовства
    private int transgression;           //трансгрессирование

    public Hogwarts(String name, int powerOfSorcery, int transgression) {
        this.name = name;
        this.powerOfSorcery = powerOfSorcery;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    public void setPowerOfSorcery(int powerOfSorcery) {
        this.powerOfSorcery = powerOfSorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int sumProperties() {
        return powerOfSorcery + transgression;
    }

    public void compareToPrint(Hogwarts other) {
        if (this.getPowerOfSorcery() > other.powerOfSorcery) {
            System.out.println(this.name + " обладает большей мощностью колдовства, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает большей мощностью колдовства, чем " + this.name);
        }
        if (this.getTransgression() > other.getTransgression()) {
            System.out.println(this.name + " обладает большей дистанцией трансгрессирования, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает большей дистанцией трансгрессирования, чем " + this.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerOfSorcery == hogwarts.powerOfSorcery && transgression == hogwarts.transgression && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, powerOfSorcery, transgression);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfSorcery=" + powerOfSorcery +
                ", transgression=" + transgression +
                '}';
    }
}