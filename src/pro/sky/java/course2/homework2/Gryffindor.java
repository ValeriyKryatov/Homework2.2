package pro.sky.java.course2.homework2;
public class Gryffindor {
    private int nobility;           //благородство
    private int honor;              //честь
    private int bravery;            //храбрость
    public Gryffindor(int nobility, int honor, int bravery) {
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
}