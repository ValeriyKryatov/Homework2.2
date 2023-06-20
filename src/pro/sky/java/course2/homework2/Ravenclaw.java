package pro.sky.java.course2.homework2;
public class Ravenclaw {
    private int mind;           //ум
    private int wisdom;         //мудрость
    private int wit;            //остроумие
    private int creation;       //творчество
    public Ravenclaw(int mind, int wisdom, int wit, int creation) {
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
}