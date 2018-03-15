public class Vehicle {

    private String name;
    private String modelNumber = "";
    private String type;
    private double mass;
    private Trait[] traits;

    public Vehicle(String name, String modelNumber, String type, double mass, Trait[] traits) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.type = type;
        this.mass = mass;
        this.traits = traits;
    }
}
