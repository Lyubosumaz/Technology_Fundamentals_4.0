package Vehicle_Catalogue_P06;

public class VehicleCatalogue {
    private String type;
    private String model;
    private String color;
    private double horsepower;

    public VehicleCatalogue(String type, String model, String color, double horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f",
                this.getType().toUpperCase().charAt(0) + this.getType().substring(1),
                this.getModel(), this.getColor(), this.getHorsepower());
    }
}