package Exercise1.Part2;

public class Animal {
    private String genus;
    private String species;

    public Animal(String genus, String species) {
        this.genus = genus;
        this.species = species;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void sound() {
        // This method will be overridden by subclasses
    }
}
