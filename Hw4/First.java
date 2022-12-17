package Hw4;



public class First {
    public static void finder(Seasons season) {
        switch (season) {
            case WINTER: System.out.println("i love winter.\n"); break;
            case SPRING: System.out.println("i love spring.\n"); break;
            case SUMMER: System.out.println("i love summer.\n"); break;
            case AUTUMN: System.out.println("i love autumn.\n"); break;
        }
    }
    public static void main(String[] args) {
        //Времена года, задание 1
        for (Spring spring : Spring.values()) {
            System.out.println(spring);
        }
        //задание 2
        Seasons season = Seasons.WINTER;
        Seasons seasons;

        //задания 3-6
        for (Seasons sea : Seasons.values()) {
            System.out.println(sea + ", average temp: " +
                    sea.getTemp() + " degrees, " + sea.getDescription());
        }
    }
}