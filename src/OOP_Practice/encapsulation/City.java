package OOP_Practice.encapsulation;

public class City {

    private long population = 1;
    String name;
    private int establishmentYear;

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    //setter
    public void setPopulation(long population) {
        this.population = population;
    }

    //getter
    public long getPopulation() {
        return population;
    }

    City() {
    }

    City(long population) {
        this.population = population;
    }

}
