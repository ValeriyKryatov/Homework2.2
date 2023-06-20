package pro.sky.java.course2.homework2;
public class Hogwarts {
       private int powerOfSorcery;          //мощность колдовства
       private int transgression;           //трансгрессирование
    public Hogwarts(int powerOfSorcery, int transgression) {
        this.powerOfSorcery = powerOfSorcery;
        this.transgression = transgression;
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
}