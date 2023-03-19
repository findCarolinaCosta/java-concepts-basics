package OOP;

public class ListCountry {
    public static void main(String[] args) {
        Country c = new Country("France", "Paris");
        System.out.println("Country:  " + c.getName());
        System.out.println("Capital:  " + c.getCapital());
    }

}

class Country {
    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }
}
