public class HotDrink extends Drink {
    private Double temperature;

    public HotDrink (String name, Double cost, Double volume,  Double temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HoteDrink{" +
                "Name=" + super.getName() +
                ", Cost=" + super.getCost() +
                ", Volume=" + super.getVolume() +
                ", Temperature=" + temperature +
                '}';
    }
}
