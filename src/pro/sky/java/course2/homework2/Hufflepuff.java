package pro.sky.java.course2.homework2;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int industriousness;            //трудолюбие
    private int loyalty;                    //верность
    private int honesty;                    //честность

    public Hufflepuff(String name, int powerOfSorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, powerOfSorcery, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int sumProperties() {
        return super.sumProperties() + industriousness + loyalty + honesty;
    }

    public void compareToPrint(Hufflepuff other) {
        if (sumProperties() > other.sumProperties()) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй:" + " " +
                "студент - " + super.getName() +
                ", мощность колдовства - " + super.getPowerOfSorcery() +
                ", трансгрессирование - " + super.getTransgression() +
                ", трудолюбие - " + industriousness +
                ", верность - " + loyalty +
                ", честность - " + honesty + ";";
    }
}