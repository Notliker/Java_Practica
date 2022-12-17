package Hw4;


public enum Seasons {
    WINTER(-25), SPRING(8), SUMMER(25){
        @Override
        public String getDescription() {
            return "Hot season";
        }
    }, AUTUMN(10);

    private double temp;

    public double getTemp() {
        return temp;
    }

    Seasons(double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return "Cold season";
    }

}
