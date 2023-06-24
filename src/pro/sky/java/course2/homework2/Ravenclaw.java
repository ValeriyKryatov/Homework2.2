package pro.sky.java.course2.homework2;
import java.util.Objects;
public class Ravenclaw extends Hogwarts {
    private int mind;           //ум
    private int wisdom;         //мудрость
    private int wit;            //остроумие
    private int creation;       //творчество
    public Ravenclaw(String name, int powerOfSorcery, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, powerOfSorcery, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public int getMind() {
        return mind;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreation() {
        return creation;
    }
    public void setCreation(int creation) {
        this.creation = creation;
    }
    public int sumProperties() {
        return super.sumProperties() + mind + wisdom + wit + creation;
    }
    public void compareToPrint(Ravenclaw other) {
        if (sumProperties() > other.sumProperties()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creation == ravenclaw.creation;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creation);
    }
    @Override
    public String toString() {
        return "Факультет Когтевран:" + " " +
                "студент - " + super.getName() +
                ", мощность колдовства - " + super.getPowerOfSorcery() +
                ", трансгрессирование - " + super.getTransgression() +
                ", ум - " + mind +
                ", мудрость - " + wisdom +
                ", остроумие - " + wit +
                ", творчество" + creation + ";";
    }
}