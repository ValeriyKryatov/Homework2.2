package pro.sky.java.course2.homework2;
public class Hufflepuff {
    private int industriousness;            //трудолюбие
    private int loyalty;                    //верность
    private int honesty;                    //честность
    public Hufflepuff(int industriousness, int loyalty, int honesty) {
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
}