package pro.sky.java.course2.homework2;
public class Main {

    public static void printSeparation() {
        System.out.println("=========================================================================================");
    }
    public static void main(String[] args) {
        System.out.println("Курс № 2. Домашнее задание № 2");
        System.out.println("");

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 99, 28, 99, 22, 33);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 44, 36, 44, 16, 41);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 29, 25, 24, 31, 52);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 6, 8, 15, 14, 54);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 12, 4, 31, 54, 45);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 15, 17, 15,36, 43);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 8, 4, 9, 12, 81, 27);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 32, 73, 14, 62, 34, 51);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 23, 81, 13, 17, 91, 34);

        Slytherin drocoMalfoy = new Slytherin("Драко Малфой", 24, 29, 56, 93, 51, 28, 32);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 67, 44, 61, 13, 56, 34, 19);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 52, 33, 16, 58, 35, 61, 52);

        printSeparation();

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);

        printSeparation();

        System.out.println(zachariahSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);

        printSeparation();

        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);

        printSeparation();

        System.out.println(drocoMalfoy);
        System.out.println(grahamMontagu);
        System.out.println(gregoryGoyle);

        printSeparation();

        harryPotter.compareToPrint(hermioneGranger);
        hermioneGranger.compareToPrint(ronWeasley);
        ronWeasley.compareToPrint(harryPotter);

        printSeparation();

        zachariahSmith.compareToPrint(cedricDiggory);
        cedricDiggory.compareToPrint(justinFinchFletchley);
        justinFinchFletchley.compareToPrint(zachariahSmith);

        printSeparation();

        zhouChang.compareToPrint(padmaPatil);
        padmaPatil.compareToPrint(marcusBelby);
        marcusBelby.compareToPrint(zhouChang);

        printSeparation();

        drocoMalfoy.compareToPrint(grahamMontagu);
        grahamMontagu.compareToPrint(gregoryGoyle);
        gregoryGoyle.compareToPrint(drocoMalfoy);

        printSeparation();

        harryPotter.compareToPrint(drocoMalfoy);
        hermioneGranger.compareToPrint(zachariahSmith);
        grahamMontagu.compareToPrint(marcusBelby);

        printSeparation();
    }
}