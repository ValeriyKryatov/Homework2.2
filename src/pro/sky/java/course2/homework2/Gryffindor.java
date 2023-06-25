package pro.sky.java.course2.homework2;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;           //благородство
    private int honor;              //честь
    private int bravery;            //храбрость

    public Gryffindor(String name, int powerOfSorcery, int transgression, int nobility, int honor, int bravery) {
        super(name, powerOfSorcery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sumProperties() {
        return super.sumProperties() + nobility + honor + bravery;
    }

    public void compareToPrint(Gryffindor other) {
        if (sumProperties() > other.sumProperties()) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор:" + " " +
                "студент - " + super.getName() +
                ", мощность колдовства - " + super.getPowerOfSorcery() +
                ", трансгрессирование - " + super.getTransgression() +
                ", благородство - " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery + ";";
    }
}