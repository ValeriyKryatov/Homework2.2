package pro.sky.java.course2.homework2;
import java.util.Objects;
public class Slytherin extends Hogwarts {
    private int cunning;            //хитрость
    private int determination;      //решительность
    private int ambition;           //амбициозность
    private int resourcefulness;    //находчивость
    private int lustForPower;       //жажда власти
    public Slytherin(String name, int powerOfSorcery, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfSorcery, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }
    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public int sumProperties() {
        return super.sumProperties() + cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareToPrint(Slytherin other) {
        if (sumProperties() > other.sumProperties()) {
            System.out.println(getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + getName());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && lustForPower == slytherin.lustForPower;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, lustForPower);
    }
    @Override
    public String toString() {
        return "Факультет Слизерин:" + " " +
                "студент - " + super.getName() +
                ", мощность колдовства - " + super.getPowerOfSorcery() +
                ", трансгрессирование - " + super.getTransgression() +
                ", хитрость - " + cunning +
                ", решительность - " + determination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + lustForPower + ";";
    }
}